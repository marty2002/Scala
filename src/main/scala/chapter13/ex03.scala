/**
  * Created by kirill on 28.12.2016.
  */

package  chapter13 {
  object ex03 extends App {

    def delFirstElem (l: List[Int]): List[Int] = {
      if (l.length == 0) List[Int]()
      else l.tail
    }

    assert(delFirstElem(List(0, 1, 2, 3, 4, 5)) == List(1, 2, 3, 4, 5))
    assert(delFirstElem(List(0))                == List())
    assert(delFirstElem(List())                 == List())
  }
}
