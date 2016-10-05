/**
  * Created by kirill on 05.10.2016.
  */

package chapter9 {
  import java.io.PrintWriter
  object ex05 extends App {
    val out = new PrintWriter("txt\\chapter9Ex05.txt", "UTF-8")
    (0 to 20).map(x=>{
      val l = math.pow(2, x).toInt
      out.println(l.toString  + " " * (8 - l.toString.length) + math.pow(2, -x).toString)
    })
    out.close
  }
}
