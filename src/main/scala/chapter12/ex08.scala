/**
  * Created by kirill on 23.12.2016.
  */
package  chapter12 {
  object ex08 extends App {
    val a = Array("test", "test1", "1test2")
    val b = Array(4, 5, 6)

    assert(a.corresponds(b)(_.length == _))
  }
}
