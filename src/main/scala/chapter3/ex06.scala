/**
  * Created by kirill on 27.09.2016.
  */
package chapter3 {

  import scala.collection.mutable.ArrayBuffer

  object ex06 extends App {
    assert(Array(1,  2, 3, 4).sortWith(_ > _).deep   == Array(4, 3, 2,  1).deep)
    assert(Array(1, -2, 0, 4).sortWith(_ > _).deep   == Array(4, 1, 0, -2).deep)
    assert(ArrayBuffer(1, 2, 3, 4).sortWith(_ > _)   == ArrayBuffer(4, 3, 2,  1))
    assert(ArrayBuffer(1, -2, 0, 4).sortWith(_ > _)  == ArrayBuffer(4, 1, 0, -2))
  }
}
