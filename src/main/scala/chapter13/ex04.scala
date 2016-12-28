/**
  * Created by kirill on 28.12.2016.
  */

package  chapter13 {
  object ex04 extends App {
    def unionCollections(a: Array[String], map: Map[String, Int]): Array[Int] = a.flatMap(map.get(_))

    assert(unionCollections(Array("aa", "bb", "cc"), Map("aa"->1, "cc"->2, "ff"->3)).deep == Array(1, 2).deep)
  }
}
