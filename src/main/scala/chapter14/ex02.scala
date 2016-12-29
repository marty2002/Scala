/**
  * Created by kirill on 29.12.2016.
  */

package  chapter14 {
  object ex02 extends App {
    def swap (x: Int, y: Int): (Int, Int) = (y, x)
    assert(swap(1, 2) == (2, 1))
  }
}
