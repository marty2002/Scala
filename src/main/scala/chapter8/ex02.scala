/**
  * Created by kirill on 03.10.2016.
  */
package chapter8 {

  import chapter5.ex02.BankAccount

  object ex02 extends App {
    class SavingAccount(private val current: Double= 0, private val cnt: Int = 0) extends BankAccount(current) {
      def service(v: Double) = if (cnt<3) v else v-1
      def earnMonthlyInterest(p: Double): SavingAccount = SavingAccount(balance + balance * p, 0)
      override def deposit (v: Double)  : SavingAccount = SavingAccount(service(super.deposit(v).balance),  cnt+1)
      override def withdraw(v: Double)  : SavingAccount = SavingAccount(service(super.withdraw(v).balance), cnt+1)
    }

    object SavingAccount {
      def apply(v: Double, cnt: Int = 0): SavingAccount = new SavingAccount(v, cnt)
    }

    // три операции
    assert(SavingAccount(100).deposit(30).withdraw(15).withdraw(25).balance == 90)
    // больше 3 операций
    assert(SavingAccount(0).deposit(30).withdraw(45).deposit(15).deposit(15).balance == 14)
    // три операции и проценты
    assert(SavingAccount(100).deposit(30).withdraw(15).withdraw(25).earnMonthlyInterest(0.1).withdraw(9).balance == 90)
  }
}

