/**
  * Created by kirill on 20.12.2016.
  */
package chapter11 {
  object ex05 extends App {

    class Table(private val value: String) {
      def |  (value: String): Table = {
        // отрезать последнюю </tr>
        // добаить новую колонку <td>value</td>
        // и вернуть отрезанную </tr>
        // если до этого ничего не было, то добавить в начало <tr>
        val newValue = (this.value splitAt (this.value lastIndexOf "</tr>"))._1 + "<td>" + value + "</td></tr>"
        if (this.value.isEmpty()) {
          return new Table("<tr>" + newValue)
        } else {
          return new Table(newValue)
        }
      }
      // начать новую строку
      def || (value: String): Table = new Table(this.value + "<tr><td>" + value + "</td></tr>")
      // вывод таблицы
      override def toString(): String = "<table>" + value + "</table>"
    }

    object Table {
      def apply() = new Table("")
    }

    assert(   (Table() |     "Java"   |   "Scala"        ||      "Gosling"    |  "Odersky"        ||      "JVM"   |   "JVM, .NET").toString()
      .equals("<table><tr><td>Java</td><td>Scala</td></tr><tr><td>Gosling</td><td>Odersky</td></tr><tr><td>JVM</td><td>JVM, .NET</td></tr></table>"))
  }
}
