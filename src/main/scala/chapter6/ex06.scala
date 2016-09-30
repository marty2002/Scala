/**
  * Created by kirill on 30.09.2016.
  */

package chapter6 {
  object ex06 extends App {

    object CardSuit extends Enumeration {
      type CardSuit = Value
      val Spades    = Value("\u2660")
      val Christen  = Value("\u2663")
      val Hearts    = Value("\u2665")
      val Diamonds  = Value("\u2666")
    }
    println(CardSuit.values.mkString(" "))
  }
}

