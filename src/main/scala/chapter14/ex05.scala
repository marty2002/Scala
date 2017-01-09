/**
  * Created by kirill on 29.12.2016.
  */

package  chapter14 {
  object ex05 extends App {
    def leafSum(lst: List[Any]): Int = lst.map({
      case l: List[Any] => leafSum(l)
      case i: Int => i
      case _ => 0
    }).sum

    assert(leafSum(List(List( 3, 8), 2, List(5)))==18)
    assert(leafSum(List(List(-3, 8), 2, List(5)))==12)
  }
}
