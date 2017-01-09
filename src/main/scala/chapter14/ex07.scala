/**
  * Created by kirill on 09.01.2017.
  */

package  chapter14 {
  object ex07 extends App {
    sealed abstract class BinaryTree
    case class Leaf(value: Int) extends BinaryTree
    case class Node(bt: BinaryTree*) extends BinaryTree

    def leafSum(t: BinaryTree): Int = t match {
      case n: Node => n.bt.map(leafSum).sum
      case l: Leaf => l.value
      case _ => 0
    }

    assert(leafSum( Node(Node(Leaf( 3), Leaf(8)), Leaf(2), Node(Leaf(5)))) == 18)
    assert(leafSum( Node(Node(Leaf(-3), Leaf(8)), Leaf(2), Node(Leaf(5)))) == 12)
  }
}
