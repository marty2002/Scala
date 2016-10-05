/**
  * Created by kirill on 05.10.2016.
  */

package chapter9 {

  import scala.io.Source

  object ex04 extends App {
    val source = Source.fromFile("txt\\chapter9Ex04.txt", "UTF-8")
    val values = source.mkString.split("\\s+").map(_.toDouble)

    assert (values.sum == 90.0)
    assert (values.min == 1.0)
    assert (values.max == 9.0)
    assert (values.sum/values.length== 5.0)

    source.close
  }
}
