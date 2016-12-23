/**
  * Created by kirill on 23.12.2016.
  */
package  chapter12 {
  object ex07 extends App {
    def adjustToPair(fun: (Int, Int) => Int) = (pair: (Int, Int)) => fun(pair._1, pair._2)

    println((((1 to 10) zip (11 to 20)).map(adjustToPair (_+_)).toArray).deep ==
            Array(12, 14, 16, 18, 20, 22, 24, 26, 28, 30).deep)
  }
}
