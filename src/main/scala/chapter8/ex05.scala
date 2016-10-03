/**
  * Created by kirill on 03.10.2016.
  */

package chapter8 {

  object ex05 extends App {

    class Point(val x: Double, val y: Double) {}

    class LabeledPoint(private val l: String, override val x: Double, override val y: Double) extends Point(x, y) {
      def label = l
    }

    val tmp = new LabeledPoint("tmp", 1.0, 2.0)
    assert(tmp.x == 1.0)
    assert(tmp.y == 2.0)
    assert(tmp.label == "tmp")
  }
}
