/**
  * Created by kirill on 29.09.2016.
  */

package chapter5 {
  object ex07 extends App {
    class Person (value: String) {
      if (value.split(" ").length < 2) throw new IllegalArgumentException("Не найден пробел")
      if (value.split(" ").length > 2) throw new IllegalArgumentException("Найдено больше одного пробела")

      private val fn = value.split(" ")(0)
      private val ln = value.split(" ")(1)

      def firstName = fn
      def lastName = ln
    }

    assert(new Person("Иван Иванов").firstName == "Иван")
    assert(new Person("Иван Иванов").lastName  == "Иванов")
  }
}

