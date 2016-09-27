/**
  * Created by kirill on 26.09.2016.
  */
package  chapter2 {
  object ex7 extends App {
  def prod(desc:String) :BigInt ={
    desc.map(BigInt(_)).product
  }

  assert(prod("Hello") == 9415087488L)  }
}

