/**
  * Created by kirill on 30.09.2016.
  */

package chapter6 {
  object ex02 extends App {

    class UintConversion () {
      def apply(value: Double) = value
    }

    object InchesToCentimeters extends UintConversion {
      override def apply(value: Double): Double = value * 2.54
    }

    object GallonsToLiters     extends UintConversion {
      override def apply(value: Double): Double = value * 3.78541
    }

    object MilesToKilometers extends UintConversion {
      override def apply(value: Double): Double = value * 1.60934
    }

    assert(InchesToCentimeters(2) == 5.08)
    assert(GallonsToLiters(2)     == 7.57082)
    assert(MilesToKilometers(2)   == 3.21868)
  }
}
