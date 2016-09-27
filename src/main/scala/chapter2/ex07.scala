/**
  * Created by kirill on 27.09.2016.
  */
package  chapter2 {
  object ex07 extends App {
    def prod(desc:String) :BigInt ={
      desc.map(BigInt(_)).product
    }

    assert(prod("Hello") == 9415087488L)  }
}
