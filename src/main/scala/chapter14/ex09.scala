/**
  * Created by kirill on 09.01.2017.
  */

package  chapter14 {
  object ex09 extends App {
    def sumNotEmptyElem(lst: List[Option[Int]]): Int = lst.flatMap(x => x).sum

    assert(sumNotEmptyElem(List(Option(5), None, None, Option(3), None, Option(-5))) == 3)
  }
}
