/**
  * Created by kirill on 28.09.2016.
  */

import scala.collection.JavaConversions.propertiesAsScalaMap

object ex07 extends App {
  val prop: scala.collection.Map[String, String]= System.getProperties()
  var maxX = (for ((x, _) <- prop) yield x.length).max
  for ((x, y) <- prop) {
    println(x + " "*(maxX-x.length) + "|" + y)
  }
}
