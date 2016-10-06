/**
  * Created by kirill on 27.09.2016.
  */

package chapter3 {

  object ex09 extends App {
    println(java.util.TimeZone.getAvailableIDs()
      .filter(_.startsWith("America/"))
      .map(_.stripPrefix("America/"))
      .sorted
      .mkString("\n"))
  }
}
