/**
  * Created by kirill on 04.10.2016.
  */

package chapter9 {

  import scala.io.Source
  import java.io.PrintWriter

  object ex02 extends App {
    val source = Source.fromFile("txt\\chapter9Ex02.txt", "UTF-8")
    val out = new PrintWriter("txt\\chapter9Ex02Res.txt", "UTF-8")

    class Cnt(val value: Int = 0, private val ch: String) {
      def inc(): Cnt = {
        if (ch == "\n" || ch == "\t" || value == 8) {
          Cnt(0, ch)
        } else {
          Cnt(value+1, ch)
        }
      }
    }

    object Cnt {
      def apply (v: Int, ch: String) = new Cnt(v, ch)
    }

    val tmp = source.foldLeft(("", 0)) {
      case ((t: String, count: Int), c) =>
        val add = if (c == '\t') " " * (8 - count) else c.toString
        (t+add, Cnt(count, c.toString).inc.value)
    }

    source.close
    out.print(tmp._1)
    out.close
  }
}
