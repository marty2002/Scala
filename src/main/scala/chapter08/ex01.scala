/**
  * Created by kirill on 30.09.2016.
  */

package chapter8 {

  import chapter5.ex02.BankAccount

  object ex01 extends App {
    class CheckingAccount(private val current: Double = 0) extends BankAccount(current) {
      def service(v: Double) = v-1
      override def deposit (v: Double): CheckingAccount = new CheckingAccount(service(super.deposit(v).balance))
      override def withdraw(v: Double): CheckingAccount = new CheckingAccount(service(super.withdraw(v).balance))
    }

    object CheckingAccount {
      def apply(v: Double): CheckingAccount = new CheckingAccount(v)
    }

    assert(CheckingAccount(100).deposit(30).withdraw(15).balance == 113)
    assert(CheckingAccount(0).deposit(30).withdraw(45).balance   == -17)
  }
}
