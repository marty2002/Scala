/**
  * Created by kirill on 14.10.2016.
  */

package chapter10 {

  object ex04 extends App {
    class CryptoLogger (private val step: Int = 3) {
      private val itemsDidit: String = "1234567890"
      private val itemsAlpha: String = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯABCDEFGHIJKLMNOPQRSTUVWXYZ"
      def ceasar(value: String): String = {
        value.map(x => {
          val items = if (x.isDigit) itemsDidit else itemsAlpha
          val indexOf = items.indexOf(x.toUpper)
          if (indexOf >= 0) {
            val ch = items.charAt((indexOf + step) % items.length)
            if (x.isLower) ch.toLower else ch
          } else {
            x
          }
        })
      }
    }

    val a: CryptoLogger = new CryptoLogger(3)
    val b: CryptoLogger = new CryptoLogger()
    assert(a.ceasar("1234567890") == b.ceasar("1234567890"))
    assert(a.ceasar("12AsjsQW 098chЫвлПРты") == "45DvmvTZ 321fkЮеоТУхю")
  }

}
