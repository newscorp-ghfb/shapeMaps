package es.weso.shapeMaps

import cats.effect._
import cats.implicits._
import com.monovore.decline._
import com.monovore.decline.effect._
import java.nio.file.Path
import es.weso.utils.IOUtils._

object ShapeMapOpts {

sealed abstract class OptShapeMap
case class OptShapeMapStr(value: String) extends OptShapeMap
case class OptShapeMapPath(value: Path) extends OptShapeMap

 val optQuiet : Opts[Boolean] = Opts.flag("quiet", help = "Don't print any metadata to the console.").orFalse
 val optShapeMapPath = Opts.option[Path]("shapeMapFile", short = "f", metavar = "file", help ="File with shapeMap")
 val optShapeMapStr = Opts.option[String]("shapeMap", short="s", metavar="name@label,...", help="Input shapeMap")
 val optShapeMap: Opts[OptShapeMap] = optShapeMapPath.map(OptShapeMapPath) orElse optShapeMapStr.map(OptShapeMapStr)
 val formatNames = ShapeMapFormat.availableFormatNames
 val formatNamesShown = ShapeMapFormat.availableFormatNames.mkString(",")
 val shapeMapFormat = "shapeMapFormat"
 val optShapeMapFormat: Opts[String] = 
     Opts.option[String](`shapeMapFormat`, 
     help = s"ShapeMap format. Available formats = ${formatNamesShown}").
     withDefault(ShapeMapFormat.defaultFormat.name).
     validate(s"${`shapeMapFormat`} must be one of ${formatNamesShown}") { 
       formatNames.contains(_) 
     }
 val outShapeMapFormat = "outShapeMapFormat"    
 val optOutputShapeMapFormat: Opts[String] = 
     Opts.option[String](`outShapeMapFormat`, 
     help = s"Output shapeMap format. Available formats = ${formatNamesShown}").
     withDefault(ShapeMapFormat.defaultFormat.name).
     validate(s"${`outShapeMapFormat`} must be one of ${formatNamesShown}") {
       formatNames.contains(_)
     }
}

import ShapeMapOpts._
object Main extends CommandIOApp(
  name = "shapeMaps", 
  header="Parse/Show shapes maps",
  version = "0.0.1") {

  override def main: Opts[IO[ExitCode]] = {
    (optQuiet, 
     optShapeMap, 
     optShapeMapFormat,
     optOutputShapeMapFormat
     ).mapN { (quiet, shapeMap, shapeMapFormat, outShapeMapFormat) => 
      (for {
        shapeMap <- getShapeMap(shapeMap, shapeMapFormat)
        _ <- IO { println(s"ShapeMap parsed: ${shapeMap.serialize(outShapeMapFormat).getOrElse("")}")}
      } yield ExitCode.Success).handleErrorWith(e => IO { 
        println(s"Error: ${e.getMessage}")
        ExitCode.Error 
      })
    }
  }

  private def getShapeMap(sm: OptShapeMap, format: String): IO[ShapeMap] = sm match {
    case OptShapeMapPath(path) => ShapeMap.fromPath(path,format)
    case OptShapeMapStr(str) => fromES(ShapeMap.fromString(str, format))
  }

  
}


