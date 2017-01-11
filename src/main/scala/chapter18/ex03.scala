/**
  * Created by kirill on 11.01.2017.
  */

package  chapter18 {
  object ex03 extends App {
    object Title
    object Author

    class Document (val title: String  = "", val author: String = "", private val obj: Any = null) {

      def set(obj: Title.type): Document = new Document(title, author, obj)
      def set(obj: Author.type):Document = new Document(title, author, obj)
      def to (arg: String): Document = {
        obj match {
          case Title  => new Document(arg, author)
          case Author => new Document(title,  arg)
          case _      => new Document(title, author)
        }
      }
    }
    val book  = new Document set Title to "Scala for the Impatient" set Author to "Cay Horstman"
    assert(book.author == "Cay Horstman")
    assert(book.title  == "Scala for the Impatient")
  }
}
