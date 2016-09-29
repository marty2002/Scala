/**
  * Created by kirill on 29.09.2016.
  */

package chapter5 {
  object ex06 extends App {
    class Person (a: Int) {
      private val age = if (a<0) 0 else a
      def getAge() = age
    }

    assert(new Person(10).getAge() == 10)
    assert(new Person(-1).getAge() ==  0)
  }
}
