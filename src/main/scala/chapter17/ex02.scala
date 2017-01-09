/**
  * Created by kirill on 09.01.2017.
  */

package  chapter17 {
  object ex02 extends App {
    class Pair[T] (var f: T, var s: T) {
      def swap: Pair[T] = new Pair[T](s, f)
    }

    assert((new Pair[String]("1", "test")).f == (new Pair[String]("test", "1")).swap.f)
    assert((new Pair[String]("1", "test")).s == (new Pair[String]("test", "1")).swap.s)
  }
}
