/**
  * Created by kirill on 03.10.2016.
  */

package chapter8 {

  import chapter8.ex05.Point

  object ex07 extends App {
    class Square(private val beginPoint: Point, private val w: Double) extends java.awt.Rectangle {
        def this(w: Double) = this(Point(0, 0), w)
        def this() = this(0)
    }

    object Square {
      def apply(bp: Point, w: Double): Square = new Square(bp, w)
      def apply(w: Double) = new Square(Point(0, 0), w)
      def apply(): Square = new Square(0)
    }
  }
}
