package es.weso.shapeMaps

import es.weso.rdf.nodes._
import cats._
import cats.implicits._
import es.weso.rdf.{PrefixMap, RDFReader}
import io.circe._
import io.circe.syntax._
import io.circe.parser._
import ShapeMap._
import es.weso.rdf.PREFIXES._
import es.weso.rdf.path._
import scala.io.Source
import scala.util.Try
import cats.effect.IO
import java.nio.file.Path
import es.weso.utils.FileUtils
import scala.util.control.NoStackTrace

abstract class ShapeMap {
  val associations: List[Association]
  def isEmpty = associations.isEmpty
  val nodesPrefixMap: PrefixMap
  val shapesPrefixMap: PrefixMap

  def add(node: RDFNode, label: ShapeMapLabel): Either[String,ShapeMap] =
    addAssociation(Association(RDFNodeSelector(node),label))

  def addAssociation(a: Association): Either[String, ShapeMap]

  def toJson: Json = {
    this.asJson
  }

  def serialize( format: String, 
                 base: Option[IRI] = None,
                ): Either[String,String] = {
    ShapeMapFormat.fromString(format).map(_ match {
      case Compact => this.relativize(base).toString
      case JsonShapeMapFormat => this.toJson.spaces2
      case CompactDetails => this.relativize(base).show
    })
  }

  def relativize(base: Option[IRI]): ShapeMap

  private def showPattern(p: Pattern, pm: PrefixMap): String = p match {
    case NodePattern(node) => pm.qualify(node)
    case WildCard => "_"
    case Focus => "FOCUS"
  }

  private def showPath(path: SHACLPath, pm: PrefixMap): String = path match {
    case PredicatePath(`rdf:type`) => "a"
    case PredicatePath(iri) => pm.qualify(iri)
    case InversePath(path) => s"^${showPath(path, pm)}"
    case SequencePath(paths) => paths.map(showPath(_, pm)).mkString("/")
    case AlternativePath(paths) => paths.map(showPath(_,pm)).mkString("|")
    case OneOrMorePath(path) => s"${showPath(path,pm)}+"
    case ZeroOrMorePath(path) => s"${showPath(path,pm)}*"
    case ZeroOrOnePath(path) => s"${showPath(path,pm)}?"
  }

  private def showNodeSelector(n: NodeSelector, pm: PrefixMap): String = {
    n match {
            case RDFNodeSelector(node) => pm.qualify(node)
            case TriplePattern(sub, path, obj) => s"{${showPattern(sub,pm)} ${showPath(path,pm)} ${showPattern(obj,pm)}}"
            case SparqlSelector(query) => s"""SPARQL `$query`"""
    }
  }

  private def showShapeMapLabel(label: ShapeMapLabel, pm: PrefixMap): String = label match {
          case IRILabel(iri) => pm.qualify(iri)
          case BNodeLabel(bn) => "_:" ++ bn.getLexicalForm
          case Start => "Start"
  }

  def showShapeMap(withDetails: Boolean): String = if (associations.isEmpty) 
    s"# Empty shape map"
   else 
    associations.map(a => showAssociation(a, nodesPrefixMap, shapesPrefixMap, withDetails)).mkString(",\n")


  override def toString: String = showShapeMap(withDetails = false)


  private def showAssociation(
    a: Association, 
    nodesPrefixMap: PrefixMap, 
    shapesPrefixMap: PrefixMap, 
    withDetails: Boolean
    ): String = {
    s"${showNodeSelector(a.node, nodesPrefixMap)}@${if (a.info.status==NonConformant) "!" else ""}${showShapeMapLabel(a.shape,shapesPrefixMap)}${if (withDetails) showDetails(a.info) else ""}"
  }

  private def showDetails(info: Info): String = {
    s" #${info.reason.getOrElse("")}"
  }


}

object ShapeMap {

  def availableFormats: List[String] = ShapeMapFormat.availableFormatNames
  def empty: ShapeMap = FixedShapeMap.empty
  def fromURI(uri: String,
              format: String,
              base: Option[IRI],
              nodesPrefixMap: PrefixMap,
              shapesPrefixMap: PrefixMap): Either[String, ShapeMap] = {
   val t = Try {
      val contents = Source.fromURL(uri).mkString
      val either: Either[String, ShapeMap] = {
        fromString(contents, format, base, nodesPrefixMap, shapesPrefixMap)
      }
      either
    }
   t.fold(e => Left(s"Exception obtaining URI contents. URI = ${uri}. Error: ${e.getLocalizedMessage}"),
     identity
   )
  }

  case class ShapeMapFromPathException(msg: String, path: Path, format: String, base: Option[IRI], nodesPrefixMap: PrefixMap, shapesPrefixMap: PrefixMap) 
    extends RuntimeException(s"""|Error obtaining shapeMap from path
                                 |Msg: ${msg}
                                 |Absolute path: ${path.toFile().getAbsolutePath()}
                                 |Format: $format
                                 |Base: ${base.map(_.getLexicalForm).getOrElse("")}
                                 |NodesPrefixMap: ${nodesPrefixMap.toString()}
                                 |ShapesPrefixMap: ${shapesPrefixMap.toString()}
                                 |""".stripMargin) 
    with NoStackTrace

  def fromPath(path: Path, 
      format: String, 
      base: Option[IRI] = None, 
      nodesPrefixMap: PrefixMap = PrefixMap.empty, 
      shapesPrefixMap: PrefixMap = PrefixMap.empty): IO[ShapeMap] = for {
    str <- FileUtils.getContents(path)
    shapeMap <- fromString(str, format, base, nodesPrefixMap, shapesPrefixMap).fold(
      str => IO.raiseError(ShapeMapFromPathException(str,path,format,base,nodesPrefixMap,shapesPrefixMap)),
      v => v.pure[IO]
    )
  } yield shapeMap

  def fromString(str: String,
                 format: String,
                 base: Option[IRI] = None,
                 nodesPrefixMap: PrefixMap = PrefixMap.empty,
                 shapesPrefixMap: PrefixMap = PrefixMap.empty
                ): Either[String,ShapeMap] =
    format.toUpperCase match {
     case "JSON" => fromJson(str)
     case "COMPACT" => {
       fromCompact(str,base,nodesPrefixMap,shapesPrefixMap)
     }
     case _ => Left(s"Unknown format for shapeMap")
   }

  def fromCompact(
    str: String,
    base: Option[IRI] = None,
    nodesPrefixMap: PrefixMap = PrefixMap.empty,
    shapesPrefixMap: PrefixMap = PrefixMap.empty): Either[String, ShapeMap] = {
    if (str.isEmpty) Right(ShapeMap.empty)
    else Parser.parse(str, base, nodesPrefixMap, shapesPrefixMap)
  }

  def fromJson(jsonStr: String): Either[String, ShapeMap] = {
    decode[ShapeMap](jsonStr).leftMap(_.getMessage)
  }

  def parseResultMap(
    str: String,
    base: Option[IRI],
    rdf: RDFReader,
    shapesPrefixMap: PrefixMap = PrefixMap.empty): IO[ResultShapeMap] =
     for {
      rdfPrefixMap <- rdf.getPrefixMap
      queryMap <- IO {
       Parser.parse(str, base, rdfPrefixMap, shapesPrefixMap).fold(e =>
        throw new RuntimeException(s"Error parsing as ShapeMap str:$str\nError: $e"),
        identity
       )
     }
    fixMap <- fixShapeMap(queryMap, rdf, rdfPrefixMap, shapesPrefixMap)
  } yield {
    ResultShapeMap(fixMap.shapeMap, rdfPrefixMap, shapesPrefixMap)
  }
  /**
   * Resolve triple patterns according to an RDF
   */
  def fixShapeMap(
    shapeMap: ShapeMap,
    rdf: RDFReader,
    nodesPrefixMap: PrefixMap,
    shapesPrefixMap: PrefixMap): IO[FixedShapeMap] = {

    val empty: IO[FixedShapeMap] = IO.pure(
      FixedShapeMap.empty.
        addNodesPrefixMap(nodesPrefixMap).
        addShapesPrefixMap(shapesPrefixMap)
    )

    def addNode(a: Association)(
      node: RDFNode,
      current: IO[FixedShapeMap]
    ): IO[FixedShapeMap] = for {
      fixed <- current
      newShapeMap <- IO {
        fixed.addAssociation(Association(
          RDFNodeSelector(node), a.shape, a.info)
        ).fold(e => throw new RuntimeException(s"Error adding association: $a to $fixed"), identity)
      }
    } yield newShapeMap

    def combine(a: Association,
                current: IO[FixedShapeMap]
               ): IO[FixedShapeMap] = {
      for {
        nodes <- a.node.select(rdf).compile.toList
        r <- nodes.foldRight(current)(addNode(a))
      } yield r
    }
    shapeMap.associations.foldRight(empty)(combine)
  }

  implicit val encodeShapeMap: Encoder[ShapeMap] = new Encoder[ShapeMap] {
    final def apply(a: ShapeMap): Json = a.associations.asJson
  }

  implicit val showShapeMap: Show[ShapeMap] = new Show[ShapeMap] {
    final def show(s: ShapeMap): String = s.toString
  }


  implicit val decodeShapeMap: Decoder[ShapeMap] = Decoder.instance { c =>
    for {
      associations <- c.as[List[Association]]
    } yield QueryShapeMap(associations, PrefixMap.empty, PrefixMap.empty)
  }

  def formats: List[String] = List("COMPACT", "JSON")

  def defaultFormat = formats.head
}
