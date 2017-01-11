/**
  * Created by kirill on 11.01.2017.
  */


package  chapter18 {
  import scala.collection.mutable.ArrayBuffer
  object ex04 extends App {
    class Network { outer =>

      class Member(val name: String, val network: Network=outer) {
        override def equals(that: Any): Boolean = {
          this.network == that.asInstanceOf[Member].network
        }
      }

      val members = new ArrayBuffer[Member]

      def join(name: String) = {
        val m = new Member(name)
        members += m
        m
      }
    }
    val n1 = new Network
    val n2 = new Network

    val name1 = n1.join("test1")
    val name2 = n2.join("test2")
    val name3 = n1.join("test3")

    println(name1.equals(name2))
    println(name1.equals(name3))
  }
}


