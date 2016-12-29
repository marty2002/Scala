/**
  * Created by kirill on 29.12.2016.
  */

package  chapter14 {

  object ex04 extends App {
    abstract class Item
    case class Article(desc: String, price: Double) extends Item
    case class Bundle(desc: String, discont: Double, items: Item*) extends Item
    case class Multiplay (num: Int, items: Item*) extends Item

    def price (it: Item): Double =  it match {
      case Article(_, p) => p
      case Bundle(_, disc, its @ _*) => its.map(price).sum - disc
      case Multiplay(n, its @ _*) => its.map(price).sum * n
    }

    assert(price(Article("test", 15.27)) == 15.27)
    assert(price(Bundle("first", 10.0, Article("a", 15.13), Article("b", 20.45))) == 25.58)
    assert(price(Multiplay(2, Bundle("first", 10.0, Article("a", 15.13), Article("b", 20.45)), Article("c", 30.27), Article("d", 59.36))) == 230.42)
  }
}
