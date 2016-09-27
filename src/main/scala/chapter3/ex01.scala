/**
  * Created by kirill on 27.09.2016.
  */
package  chapter3 {

  object ex01 extends App {
    def createArr(l: Int) :Array[Int] = {
      (0 until l).toArray
    }

    assert(createArr(3).deep == Array(0, 1, 2).deep)
    assert(createArr(4).deep != Array(0, 1, 2).deep)
  }
}

