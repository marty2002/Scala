/**
  * Created by kirill on 29.12.2016.
  */

package  chapter14 {
  object ex03 extends App {
    def swap(a: Array[Int]): Array[Int] =
      a match {
        case Array(x, y, t @ _*) => Array((y +: x +: t): _*)
        case ar => ar
      }

    assert(swap(Array()).deep           == Array().deep)
    assert(swap(Array(1)).deep          == Array(1).deep)
    assert(swap(Array(1, 2)).deep       == Array(2, 1).deep)
    assert(swap(Array(1, 2, 3)).deep    == Array(2, 1, 3).deep)
    assert(swap(Array(1, 2, 3, 4)).deep == Array(2, 1, 3, 4).deep)
 }
}
