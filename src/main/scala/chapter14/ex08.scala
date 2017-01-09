/**
  * Created by kirill on 09.01.2017.
  */

package  chapter14 {
  object ex08 extends App {
    sealed abstract class BinaryTree
    case class Leaf(value: Int) extends BinaryTree
    case class Node(op: Char, bt: BinaryTree*) extends BinaryTree

    def eval(t: BinaryTree): Int = t match {
      case Node('+', t @ _*) => t.map(eval).sum
      case Node('*', t @ _*) => t.map(eval).product
      case Node('-', t @ _*) => t.map(eval).foldLeft(0)(_ - _)
      case l: Leaf => l.value
      case _ => 0
    }

    assert(eval(Node('+', Node('*', Leaf(3), Leaf(8)), Leaf(2), Node('-', Leaf(5)))) == 21)
  }
}
