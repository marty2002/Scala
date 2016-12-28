/**
  * Created by kirill on 28.12.2016.
  */

package  chapter13 {
  object ex05 extends App {
    def myMkString(col: Iterable[Any], sep: String) = col.reduceLeft(_.toString + sep + _.toString)

    println(myMkString(Array(1, 2, 3, 4), ", "))
    println(myMkString(List(1, 2, 3, 4), ", "))
    println(myMkString(Set(1, 2, 3, 4), ", "))
    println(myMkString(Map(1->1, 2->2, 3->3, 4->4), ", "))
  }
}
