/**
  * Created by kirill on 28.12.2016.
  */

package  chapter13 {
  import scala.collection.immutable.Map
  import scala.collection.immutable.Set

  object ex02 extends App {
    def indexes (str: String) = {
      str.zipWithIndex.foldLeft(Map[Char, Set[Int]]())(
        (m, iter) =>
          m + (iter._1 -> (
            m.getOrElse(iter._1, Set[Int]()) +  iter._2
            ))
      )
    }

    println(indexes("Mississippi"))

  }
}
