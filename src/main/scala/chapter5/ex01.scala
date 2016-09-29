/**
  * Created by kirill on 29.09.2016.
  */

package chapter5 {
  object ex01 extends App {

    class MyCounter(private val value: Int = 0) {
      def increment():MyCounter = {
        val add = if (value < Int.MaxValue) 1 else 0
        new MyCounter(value + add)
      }
      def current = value
    }

    var c = new MyCounter(Int.MaxValue)
    c=c.increment()
    assert(c.current == Int.MaxValue)
  }
}
