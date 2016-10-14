/**
  * Created by kirill on 14.10.2016.
  */

package chapter10 {

  object ex02 extends App {
    class OrderedPoint(x: Int, y:Int) extends java.awt.Point(x, y) with scala.math.Ordered[java.awt.Point] {
      override def compare(value: java.awt.Point) = {
        if      (x < value.x)   1
        else if (x > value.x)  -1
        else if (y < value.y)   1
        else if (y > value.y)  -1
        else                    0
      }
    }

    val p1 = new OrderedPoint(1, 1)
    val p2 = new OrderedPoint(2, 1)
    val p3 = new OrderedPoint(1, 2)
    val p4 = new OrderedPoint(1, 1)

    assert(p1.compare(p2) ==  1)
    assert(p2.compare(p1) == -1)
    assert(p1.compare(p3) ==  1)
    assert(p3.compare(p1) == -1)
    assert(p1.compare(p4) ==  0)
    assert(p4.compare(p1) ==  0)
  }
}
