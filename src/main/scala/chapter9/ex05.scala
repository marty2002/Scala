/**
  * Created by kirill on 05.10.2016.
  */

package chapter9 {
  object ex05 extends App {
    (0 to 20).map(x=>{
      val l = math.pow(2, x).toInt
      println(l.toString  + " " * (8 - l.toString.length) + math.pow(2, -x).toString)
    })
  }
}
