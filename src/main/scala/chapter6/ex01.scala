/**
  * Created by kirill on 30.09.2016.
  */

package chapter6 {
  object ex01 extends App {
    object Convertions {
      def inchesToCentimeters (value: Double): Double = value * 2.54
      def gallonsToLiters     (value: Double): Double = value * 3.78541
      def milesToKilometers   (value: Double): Double = value * 1.60934
    }

    assert(Convertions.inchesToCentimeters(2) == 5.08)
    assert(Convertions.gallonsToLiters(2)     == 7.57082)
    assert(Convertions.milesToKilometers(2)   == 3.21868)
  }
}
