/**
  * Created by kirill on 30.09.2016.
  */

package chapter6 {
  object ex07 extends App {

    object CardSuit extends Enumeration {
      type CardSuit = Value
      val Spades    = Value("\u2660")
      val Christen  = Value("\u2663")
      val Hearts    = Value("\u2665")
      val Diamonds  = Value("\u2666")
    }

    def isRedSuit(value: CardSuit.CardSuit): Boolean = value == CardSuit.Hearts || value == CardSuit.Diamonds

    assert(!isRedSuit(CardSuit.Spades))
    assert(!isRedSuit(CardSuit.Christen))
    assert( isRedSuit(CardSuit.Hearts))
    assert( isRedSuit(CardSuit.Diamonds))
  }
}

