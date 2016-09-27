package chapter2 {
  object ex05 extends App {

    def countDown(n: Int) {
      for (i <- 0 to n) println(n-i)
    }

    countDown(10)
  }
}

