/**
  * Created by kirill on 14.10.2016.
  */

package chapter10 {

  object ex01 extends App {
    trait RectangleLike extends java.awt.geom.RectangularShape{
      def translate(x: Int, y: Int) = {
        setFrame(getX() + x, getY() + y, getWidth(), getHeight())
      }
      def grow(x: Int, y: Int) = {
        setFrame(getX(), getY(), getWidth() + x, getHeight() + y)
      }
    }

    val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
    egg.translate(10, -10)
    assert(egg.x      == 15.0)
    assert(egg.y      ==  0.0)
    assert(egg.width  == 20.0)
    assert(egg.height == 30.0)
    egg.grow(10, 20)
    assert(egg.x      == 15.0)
    assert(egg.y      ==  0.0)
    assert(egg.width  == 30.0)
    assert(egg.height == 50.0)
  }
}
