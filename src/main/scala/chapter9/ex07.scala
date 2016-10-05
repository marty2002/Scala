/**
  * Created by kirill on 05.10.2016.
  */

package chapter9 {

  import scala.io.Source

  object ex07 extends App {
    val source = Source.fromFile("txt\\chapter9Ex07.txt", "UTF-8")
    source.mkString.split("\\s+").map(w => if (!w.matches("-?[0-9]+.?[0-9]*")) println(w))
    source.close
  }
}
