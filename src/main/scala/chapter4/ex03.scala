/**
  * Created by kirill on 28.09.2016.
  */

package chapter4 {

  import scala.collection.mutable.ArrayBuffer

  object ex03 extends App {
    val in = new java.util.Scanner(new java.io.File("txt\\chapter4Ex02.txt"))
    val words: ArrayBuffer[String] = new ArrayBuffer[String]()
    while (in.hasNext) words += in.next

    val res: Map[String, Int] = (
      for (w <- words.distinct) yield {
        (w, words.count(x => x == w))
      }).toMap

    for((w, c) <- res) println("Слово: " + w + " Количество: " + c.toString)
  }
}
