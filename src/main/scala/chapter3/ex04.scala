package chapter3 {

  import scala.collection.mutable.ArrayBuffer

  object ex04 extends App {

    def sortArr(arr: Array[Int]) : Array[Int] = {
      val pos: ArrayBuffer[Int] = new ArrayBuffer[Int]()
      val oth: ArrayBuffer[Int] = new ArrayBuffer[Int]()
      arr.map(el => if (el>0) pos += el else oth+= el)
      (pos ++ oth).toArray
    }

    assert(sortArr(Array(-1, -2, 3, 4, 0, 0, -3, 5, 0)).deep    == Array( 3,  4,  5, -1, -2,  0,  0, -3, 0).deep)
    assert(sortArr(Array(1, 2, 3, 4, 0, 0, 3, 5, 0)).deep       == Array( 1,  2,  3,  4,  3,  5,  0,  0, 0).deep)
    assert(sortArr(Array(-1, -2, -3, -4, 0, 0, -3, -5, 0)).deep == Array(-1, -2, -3, -4,  0,  0, -3, -5, 0).deep)
    assert(sortArr(Array(0)).deep                               == Array(0).deep)
  }
}

