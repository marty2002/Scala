/**
  * Created by kirill on 10.01.2017.
  */

package  chapter17 {
  object ex06 extends App {
    def middle[T] (value: Iterable[T]): Option[T] = {
      val l = value.toList
      val len = l.length
      if (len%2 == 0) None else Some(l(len/2))
    }

    assert(middle("world") == Some('r'))
    assert(middle("test")  == None)
  }
}
