package chapter11 {
  object ex03 extends App {
    class Fraction(n: Int, d: Int) {
      private val num: Int = if (d == 0) 0 else n * sign(d) / gcd(n, d)
      private val den: Int = if (d == 0) 1 else d * sign(d) / gcd(n, d)

      private def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
      private def abs(a: Int): Int = if (a > 0) a else -a
      private def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)
      private def lcm(a: Int, b: Int): Int = abs(a * b) / gcd(a, b)

      override def toString: String = {
        val anum: Int = abs(num)  // так как потом используется
        if      (anum == den)  sign(num).toString // еденица с нужным знаком
        else if (anum <  den)  num + "/" + den    // натуральная дробь без целой части
        else {
          val o = anum%den // остаток от деления
          if (o == 0)          (num/den).toString // делиться нацело
          else                 (num/den) + " " + o + "/" + den // выделение целой части + дробь
        }
      }

      def == (other: Fraction): Boolean = (num == other.num) && (den == other.den)
      def + (other: Fraction): Fraction = {
        val l = lcm(den, other.den)
        Fraction(num * (l / den) + other.num * (l / other.den), l)
      }
      def - (other: Fraction): Fraction = {
        this + Fraction(-other.num, other.den)
      }
      def * (other: Fraction): Fraction = Fraction(num * other.num, den * other.den)
      def / (other: Fraction): Fraction = Fraction(num * other.den, den * other.num)
    }

    object Fraction {
      def apply(n: Int, d: Int) = new Fraction(n, d)
    }

    assert(Fraction(-15,  6) == Fraction(-5, 2))
    assert(Fraction(-15, -6) == Fraction( 5, 2))
    assert(Fraction( 15, -6) == Fraction(-5, 2))
    assert(Fraction( 15,  6) +  Fraction( 5, 2) == Fraction(  5, 1))
    assert(Fraction( 15,  6) +  Fraction(-5, 2) == Fraction(  0, 1))
    assert(Fraction( 15,  6) -  Fraction( 5, 2) == Fraction(  0, 1))
    assert(Fraction( 15,  6) -  Fraction(-5, 2) == Fraction(  5, 1))
    assert(Fraction( 15,  6) *  Fraction( 5, 2) == Fraction( 25, 4))
    assert(Fraction( 15,  6) *  Fraction(-5, 2) == Fraction(-25, 4))
    assert(Fraction( 15,  6) /  Fraction( 5, 2) == Fraction(  1, 1))
    assert(Fraction( 15,  6) /  Fraction(-5, 2) == Fraction( -1, 1))
  }
}