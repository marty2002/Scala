package chapter3 {

  object ex05 extends App {
    val arr : Array[Double]= Array(1.4, 2.5, 3.7, 4.8)
    assert(arr.sum.toFloat/arr.length == 3.1.toFloat)
  }
}
