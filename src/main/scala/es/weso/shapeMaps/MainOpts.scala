package es.weso.shapeMaps

import org.rogach.scallop._

class MainOpts(arguments: Array[String], 
               onError: (Throwable, Scallop) => Nothing) extends ScallopConf(arguments) {

  banner("""| shapeMaps: ShapeMaps command line tool
                | Options:
                |""".stripMargin)


  footer("Enjoy!")

}
