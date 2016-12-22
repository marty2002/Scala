/**
  * Created by kirill on 22.12.2016.
  */

package  chapter12 {
  object ex02 extends App {
    assert(Array(7, 3, 1, 8, 4, 2).reduceLeft(math.max) == 8)
  }
}
