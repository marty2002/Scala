/**
  * Created by kirill on 10.01.2017.
  */

package  chapter17 {
  object ex03 extends App {
    class Pair[T, S] (var f: T, var s: S)
    def swap[T, S](p: Pair[S, T]): Pair[T, S] = new Pair[T, S](p.s, p.f)

    assert((new Pair[Int, String](1, "test")).f == swap(new Pair[String, Int]("test", 1)).f)
    assert((new Pair[Int, String](1, "test")).s == swap(new Pair[String, Int]("test", 1)).s)
  }
}
