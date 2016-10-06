/**
  * Created by kirill on 28.09.2016.
  */
import scala.collection.JavaConversions.mapAsScalaMap

package chapter4 {

  object ex05 extends App {
    val in = new java.util.Scanner(new java.io.File("txt\\chapter4Ex05.txt"))
    var words = new java.util.TreeMap[String, Int]()
    while (in.hasNext) {
      val w = in.next
      if (words.contains(w)) words(w) += 1 else words(w) = 1
    }
    for((w, c) <- words) println("Слово: " + w + " Количество: " + c.toString)
  }
}
