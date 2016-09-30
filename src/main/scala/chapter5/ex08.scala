/**
  * Created by kirill on 29.09.2016.
  */
package chapter5 {

  object ex08 extends App {
    class Car (
      private val m: String,
      private val c: String,
      private val y: Int = -1,
      private val r: String = "") {

      def this(model: String, corp:String) {
        this(m=model, c=corp)
      }
      def this(model: String, corp: String, year: Int) {
        this(m=model, c=corp, y=year)
      }
      def this(model: String, corp:String, regNum: String) {
        this(m=model, c=corp, r=regNum)
      }

      def model  = m
      def corp   = c
      def year   = y
      def regNum = r
      def regNum(regNum: String): Car = new Car(model, corp, year, regNum)
    }

    assert(new Car("model", "corp", 1, "oldRegNum").regNum("newRegNum").regNum == "newRegNum")
    assert(new Car("model", "corp", 1).regNum("newRegNum").regNum == "newRegNum")
    assert(new Car("model", "corp", "oldRegNum").regNum("newRegNum").regNum == "newRegNum")
    assert(new Car("model", "corp").regNum("newRegNum").regNum == "newRegNum")
  }
}
