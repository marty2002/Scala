/**
  * Created by kirill on 05.10.2016.
  */

package chapter9 {

  import scala.io.Source

  object ex03 extends App {
    val source = Source.fromFile("txt\\chapter9Ex03.txt", "UTF-8")
    source.mkString.split("\\s+").map(w => if(w.length>=12) println(w))
    source.close
  }
}
