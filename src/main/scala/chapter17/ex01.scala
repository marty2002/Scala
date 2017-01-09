/**
  * Created by kirill on 09.01.2017.
  */

package  chapter17 {
  object ex01 extends App {
    class Pair[T, S] (val f: T, val s: S) {
      def swap: Pair[S, T] = new Pair[S, T](s, f)
    }

    assert(Pair(1, "test")._1 == Pair("test", 1).swap._1)
    assert(Pair(1, "test")._2 == Pair("test", 1).swap._2)
  }
}
