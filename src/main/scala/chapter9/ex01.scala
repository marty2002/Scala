/**
  * Created by kirill on 03.10.2016.
  */
import scala.io.Source

package chapter9 {

  import java.io.PrintWriter

  object ex01 extends App {
    val source = Source.fromFile("txt\\chapter9Ex01.txt", "UTF-8")
    val out = new PrintWriter("txt\\chapter9Ex01Res.txt", "UTF-8")
    source.getLines().toList.reverse.map(l => out.println(l))
    source.close
    out.close
  }
}
