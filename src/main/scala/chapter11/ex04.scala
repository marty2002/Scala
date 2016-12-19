/**
  * Created by kirill on 19.12.2016.
  */
package chapter11 {
  object ex04 extends App {
    class Money(private val dollar: Int, private val cent: Int) {
      private def normalizeMoney (m: Money): Money = Money(m.dollar + m.cent/100, m.cent%100)
      def + (other: Money): Money     = this.normalizeMoney(Money(dollar + other.dollar, cent + other.cent))
      def == (other: Money): Boolean  = {
        val v1 = this.normalizeMoney(this)
        val v2 = this.normalizeMoney(other)
        (v1.dollar == v2.dollar) && (v1.cent == v2.cent)
      }
   }

    object Money {
      def apply(d: Int, c: Int) = new Money(d, c)
    }

    assert(Money(1, 75) + Money(0, 50) == Money(2, 25))
    assert(Money(3, 75) + Money(2, 25) == Money(6, 0))
    assert(Money(1, 156) == Money(2, 56))
  }
}
