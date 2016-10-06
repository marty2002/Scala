/**
  * Created by kirill on 30.09.2016.
  */

package chapter6 {
  object ex04 extends App {

    class Point(private val x: Double, private val y: Double) {
      def equal(from: Point): Boolean = x == from.x && y == from.y
    }

    object Point {
      def apply(x: Double, y: Double): Point = new Point(x, y)
    }

    assert( new Point(1, 2).equal(Point(1, 2)))
    assert(!new Point(1, 2).equal(Point(2, 2)))
  }
}

