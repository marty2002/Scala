/**
  * Created by kirill on 28.09.2016.
  */

package chapter4 {

  object ex02 extends App {
    var in = new java.util.Scanner(new java.io.File("txt\\chapter4Ex02.txt"))
    var words = new scala.collection.mutable.HashMap[String, Int]()
    while (in.hasNext) {
      val w = in.next()
      words(w) = words.getOrElse(w, 0) + 1
    }

    for((w, c) <- words) {
      println("Слово: " + w + " Количество: " + c.toString)
    }
  }
}
