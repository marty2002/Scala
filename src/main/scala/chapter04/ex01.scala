/**
  * Created by kirill on 28.09.2016.
  */

package chapter4 {

  object ex01 extends App {
    def discontMap(map: Map[String, Double]): Map[String, Double] = {
      for ((k, v) <- map) yield (k, (v * 0.9))
    }

    var a :Map[String, Double] =
      Map(
      "test1" -> 10,
      "test2" -> 20,
      "test3" -> 30)


    var a1 :Map[String, Double] =
      Map(
        "test1" -> 10.10,
        "test2" -> 20.20,
        "test3" -> 30.30)

    assert(discontMap( a).equals(Map("test1" -> 9.00, "test2" -> 18.00, "test3" -> 27.00)))
    assert(discontMap(a1).equals(Map("test1" -> 9.09, "test2" -> 18.18, "test3" -> 27.27)))
  }
}
