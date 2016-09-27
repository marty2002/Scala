/**
  * Created by kirill on 27.09.2016.
  */

package  chapter2 {
  object ex10 extends App {
    def mypow(from: Double, power: Int): Double = {
      if (power > 0) {
        if (power % 2 == 0) {
          mypow(from, power/2) * mypow(from, power/2)
        } else {
          from * mypow(from, power-1)
        }
      } else if (power < 0) {
          1 / mypow(from, -power)
      } else 1
    }

    assert(mypow(2, 2)  == 4)
    assert(mypow(2, 3)  == 8)
    assert(mypow(2, 0)  == 1)
    assert(mypow(2, -3) == 0.125)
  }
}
