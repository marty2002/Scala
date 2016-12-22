/**
  * Created by kirill on 22.12.2016.
  */

package  chapter12 {
  object ex01 extends App {
    def values(fun: (Int) => Int, low: Int, hight: Int) = (low to hight).map(x => Tuple2(x, fun(x)))

    assert(values(x => x * x, -5, 5).toArray.deep == Array((-5, 25), (-4, 16), (-3, 9), (-2, 4), (-1, 1), (0, 0), (1, 1), (2, 4), (3, 9), (4, 16), (5, 25)).deep)
    assert(values(x => x *3, 1, 3).toArray.deep != Array((1, 1), (2, 2), (3, 3)))
  }
}
