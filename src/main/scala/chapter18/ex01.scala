/**
  * Created by kirill on 10.01.2017.
  */

package  chapter18 {
  object ex01 extends App {
    class Bug(val f: Boolean = true, val pos: Int = 0) {
      def move(sh: Int) = new Bug(f, if (f) pos+sh else pos-sh)
      def turn() = new Bug(!f, pos)
      def show() = {
        println(pos)
        this
      }
    }

    new Bug().move(4).show().move(6).show().turn().move(5).show()
  }
}
