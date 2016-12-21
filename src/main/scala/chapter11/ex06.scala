/**
  * Created by kirill on 20.12.2016.
  */
package chapter11 {
  object ex06 extends App {

    class AsciiArt (private val value: String) {

      private val lines: Array[String] = value split "\r\n"
      private val widthMax  = this.lines.map(_.length).max
      private val lengthMax = this.lines.length

      private def concatString(val1: String, val2: String, width: Int) =
        val1 + " "* (width-val1.length) + val2 + " "*(width-val2.length)


      def > (rightValue: AsciiArt): AsciiArt = {
        val width = math.max(this.widthMax, rightValue.widthMax)
        return AsciiArt((for (i <- 0 to this.lengthMax - 1) yield {

          this.concatString(
            if(this.lines.isDefinedAt(i)) this.lines(i) else "",
            if(rightValue.lines.isDefinedAt(i)) rightValue.lines(i) else "",
            width)

        }).mkString("\r\n"))
      }

      def V (rightValue: AsciiArt): AsciiArt = {
        AsciiArt(this.lines.mkString("\r\n") + "\r\n" + rightValue.lines.mkString("\r\n"))
      }

      def print() = lines.mkString("\r\n")
    }

    object AsciiArt {
      def apply(values: String) = new AsciiArt(values)
    }

    val v1 = AsciiArt(" /\\_/\\ \r\n( . . )\r\n(  -  )\r\n | | |\r\n(__|__)")
    val v2 = AsciiArt(" /\\_/\\ \r\n( . . )\r\n(  -  )\r\n | | |\r\n(__|__)")
    val v3 = AsciiArt(" /\\_/\\ \r\n( . . )\r\n(  -  )\r\n | | |\r\n(__|__)")
    val res = v1  > v2 V v3

    println(res.print)
  }
}

