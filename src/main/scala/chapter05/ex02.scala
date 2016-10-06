/**
  * Created by kirill on 29.09.2016.
  */

package chapter5 {
  object ex02 extends App {
    class BankAccount (private val current: Double = 0) {
      def deposit(v: Double) = new BankAccount(current+v)
      def withdraw(v: Double)= new BankAccount(current-v)
      def balance = current
    }

    assert(new BankAccount(100).deposit(30).withdraw(15).balance == 115)
    assert(new BankAccount(0).deposit(30).withdraw(45).balance == -15)
  }
}