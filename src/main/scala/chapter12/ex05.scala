/**
  * Created by kirill on 22.12.2016.
  */

package  chapter12 {
  object ex05 extends App {
    def largest (fun: (Int)=>Int, inputs: Seq[Int]) =  inputs.map(fun).max

    assert(largest(x=>10*x-x*x, 1 to 20) == 25)
  }
}
