/**
  * Created by kirill on 27.09.2016.
  */

package chapter3 {

  object ex07 extends App {
    assert(Array(1, 2, 3, 4, 2, 1, 3, 4, 1, 2, 3, 4, 1, 1,1 ,2).distinct.deep   == Array(1, 2, 3, 4).deep)
    assert(Array(3, 1, 3, 4, 1, 2, -1, 0, 3, -2, -1).distinct.deep == Array(3, 1, 4, 2, -1, 0, -2).deep)
  }
}
