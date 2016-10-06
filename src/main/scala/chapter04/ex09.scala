/**
  * Created by kirill on 29.09.2016.
  */

object ex09 extends App {
  def lteqgt(values: Array[Int], v: Int): (Int, Int, Int) = {
    (values.count(_<v), values.count(_==v), values.count(_>v))
  }

  assert(lteqgt(Array( 1,  2,  3,  4,  5,  6),  3) == (2, 1, 3))
  assert(lteqgt(Array(-1, -2, -3, -4, -5, -6), -3) == (3, 1, 2))
}

