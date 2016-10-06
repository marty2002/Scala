/**
  * Created by kirill on 27.09.2016.
  */
package  chapter3 {

  object ex03 extends App {

    def changeArr(arr: Array[Int]): Array[Int] = {
      val len = arr.length
      (for (i <- 0 until len) yield {
        if (i%2 != 0) arr(i-1)
        else if(i<len-1) arr(i+1)
        else arr(i)
      }).toArray
    }

    assert(changeArr(Array()).deep == Array().deep)
    assert(changeArr(Array(4)).deep == Array(4).deep)
    assert(changeArr(Array(1, 2, 3, 4)).deep == Array(2, 1, 4, 3).deep)
    assert(changeArr(Array(1, 2, 3, 4, 5)).deep == Array(2, 1, 4, 3, 5).deep)
  }
}

