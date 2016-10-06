/**
  * Created by kirill on 27.09.2016.
  */
package  chapter3 {

  import scala.collection.mutable.ArrayBuffer

  object ex02 extends App {

    def changeArr(arr: Array[Int]): Array[Int] = {
      val a: ArrayBuffer [Int] = new ArrayBuffer[Int]()
      val len = arr.length
      for (i <- 0 until len by +2) {
        if (i+1 < len) {
          a += arr(i+1)
          a += arr(i)
        } else {
          a += arr(i)
        }
      }
      a.toArray
    }

    assert(changeArr(Array()).deep == Array().deep)
    assert(changeArr(Array(4)).deep == Array(4).deep)
    assert(changeArr(Array(1, 2, 3, 4)).deep == Array(2, 1, 4, 3).deep)
    assert(changeArr(Array(1, 2, 3, 4, 5)).deep == Array(2, 1, 4, 3, 5).deep)
  }
}

