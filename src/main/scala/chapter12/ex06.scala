/**
  * Created by kirill on 23.12.2016.
  */
package  chapter12 {
  object ex06 extends App {
    def largest (fun: (Int)=>Int, inputs: Seq[Int]) =  (inputs.map(x => Tuple2(fun(x),x)).max)._2

    assert(largest(x=>10*x-x*x, 1 to 20) == 5)
  }
}
