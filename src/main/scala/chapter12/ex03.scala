/**
  * Created by kirill on 22.12.2016.
  */

package  chapter12 {
  object ex03 extends App {
    def factorial(n: Int) = {
      if (n < 0) {
        throw new IllegalArgumentException("Расчет факториала возможен только для положительных чисел")
      }
      (1 to (if (n==0) 1 else n)).reduceLeft(_*_)
    }

    assert(factorial(0) == 1)
    assert(factorial(3) == 6)
  }
}
