package  chapter2 {

  import scala.collection.immutable.StringOps

  object ex9 extends App {
    def prod(desc:StringOps) :BigInt = {
      if (desc.length == 0) 1 else BigInt(desc.head) * prod(desc.tail)
    }

    assert(prod("Hello") == 9415087488L)
  }
}

