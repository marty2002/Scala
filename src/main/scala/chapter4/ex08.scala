/**
  * Created by kirill on 29.09.2016.
  */

import scala.collection.JavaConversions.propertiesAsScalaMap

object ex08 extends App {
  def minmax(values: Array[Int]): (Int, Int) = {
    (values.min, values.max)
  }

  assert(minmax(Array( 1,  2,  3,  4,  5,  6)) == ( 1,  6))
  assert(minmax(Array(-1, -2, -3, -4, -5, -6)) == (-6, -1))
}
