/**
  * Created by kirill on 03.10.2016.
  */

package chapter8 {

  import chapter8.ex05.Point
  object ex06 extends App {
    abstract class Share {
      def centerPoint: Point
    }

    class Rectangle (private val beginPoint: Point, width: Double, height: Double) extends Share {
      override def centerPoint: Point = Point (beginPoint.x + width/2, beginPoint.y + height/2)
    }
    class Circle (override val centerPoint: Point, radius: Double) extends Share {}

    object Rectangle {def apply(bp: Point, w: Double, h: Double): Rectangle = new Rectangle(bp, w, h)}
    object Circle {def apply(cp: Point, r: Double): Circle = new Circle(cp, r)}

    val rectangle: Rectangle = Rectangle(Point(0, 0), 10, 20)
    assert(rectangle.centerPoint.x == 5)
    assert(rectangle.centerPoint.y == 10)

    val circle    = Circle(Point(10, 15), 25)
    assert(circle.centerPoint.x == 10)
    assert(circle.centerPoint.y == 15)
  }
}
