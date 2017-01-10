/**
  * Created by kirill on 10.01.2017.
  */

package  chapter18 {
  object ex02 extends App {
    object show
    object then
    object around

    class Bug(val f: Boolean = true, val pos: Int = 0) {
      def move(sh: Int) = new Bug(f, if (f) pos+sh else pos-sh)
      def turn(obj: around.type) = new Bug(!f, pos)
      def showP() = {
        println(pos)
        this
      }

      def and(obj: show.type) = this.showP
      def and(obj: then.type) = this
    }

    new Bug() move 4 and show and then move 6 and show turn around move 5 and show
  }
}
