/**
  * Created by kirill on 03.10.2016.
  */
package chapter8 {

  object ex04 extends App {
    abstract class Item () {
      def price: Int
      def description: String
    }

    class SimpleItem (override val price: Int, override val description: String) extends Item() {}

    class Bundle (private val list: List[SimpleItem]=List()) {
      def add(value: SimpleItem): Bundle = new Bundle(List(list, List(value)).flatten)
      def price: Int = list.foldLeft(0)((x:Int, y:SimpleItem)=>x+y.price)
      def description: String = list.map(_.description).mkString(", ")
    }

    object Bundle {
      def apply(l: List[SimpleItem]=List()) = new Bundle(l)
    }
    object SimpleItem {
      def apply(p: Int, d: String) = new SimpleItem(p, d)
    }


    assert(Bundle()
      .add(SimpleItem(1, "1"))
      .add(SimpleItem(2, "2"))
      .add(SimpleItem(3, "3"))
      .price == 6)

    assert(Bundle()
      .add(SimpleItem(1, "1"))
      .add(SimpleItem(2, "2"))
      .add(SimpleItem(3, "3"))
      .description == "1, 2, 3")
  }
}

