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

  override def toString = Show[ShapeMap].show(this)

  def serialize(format: String, base: Option[IRI] = None): Either[String,String] = {
    ShapeMapFormat.fromString(format).map(_ match {
      case Compact => this.relativize(base).toString
      case JsonShapeMapFormat => this.toJson.spaces2
    })
  }

  def relativize(base: Option[IRI]): ShapeMap

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

    final def show(a: ShapeMap): String = {

      implicit val showPattern: Show[Pattern] = new Show[Pattern] {
        final def show(n: Pattern): String = {
          n match {
            case NodePattern(node) => a.nodesPrefixMap.qualify(node)
            case WildCard => "_"
            case Focus => "FOCUS"
          }
        }
      }

      /*implicit val showPredicate: Show[IRI] = new Show[IRI] {
        final def show(iri: IRI): String = iri match {
          case `rdf_type` => "a"
          case _ => a.nodesPrefixMap.qualify(iri)
        }
      } */

      implicit val showPath: Show[SHACLPath] = new Show[SHACLPath] {
        final def show(path: SHACLPath): String = path match {
          case PredicatePath(`rdf:type`) => "a"
          case PredicatePath(iri) => a.nodesPrefixMap.qualify(iri)
          case InversePath(path) => s"^${show(path)}"
          case SequencePath(paths) => paths.map(show(_)).mkString("/")
          case AlternativePath(paths) => paths.map(show(_)).mkString("|")
          case OneOrMorePath(path) => s"${show(path)}+"
          case ZeroOrMorePath(path) => s"${show(path)}*"
          case ZeroOrOnePath(path) => s"${show(path)}?"
        }
      }

      implicit val showNodeSelector: Show[NodeSelector] = new Show[NodeSelector] {
        final def show(n: NodeSelector): String = {
          n match {
            case RDFNodeSelector(node) => a.nodesPrefixMap.qualify(node)
            case TriplePattern(sub, path, obj) => s"{${sub.show} ${path.show} ${obj.show}}"
            case SparqlSelector(query) => s"""SPARQL `$query`"""
          }
        }
      }

      implicit val showShapeMapLabel: Show[ShapeMapLabel] = new Show[ShapeMapLabel] {
        final def show(label: ShapeMapLabel): String = label match {
          case IRILabel(iri) => a.shapesPrefixMap.qualify(iri)
          case BNodeLabel(bn) => "_:" ++ bn.getLexicalForm
          case Start => "Start"
        }
      }

      implicit val showAssociation: Show[Association] = new Show[Association] {
        final def show(a: Association): String = {
          s"${a.node.show}@${if (a.info.status==NonConformant) "!" else ""}${a.shape.show}"
        }
      }
      if (a.associations.isEmpty) s"<EmptyShowMap>"
      else a.associations.map(_.show).mkString(",")
    }
  }

  implicit val decodeShapeMap: Decoder[ShapeMap] = Decoder.instance { c =>
    for {
      associations <- c.as[List[Association]]
    } yield QueryShapeMap(associations, PrefixMap.empty, PrefixMap.empty)
  }

  def formats: List[String] = List("COMPACT", "JSON")

  def defaultFormat = formats.head
}
