/**
  * Created by kirill on 05.10.2016.
  */

package chapter9 {

  import scala.io.Source

  object ex08 extends App {
    val source = Source.fromFile("txt\\chapter9Ex08.txt", "UTF-8")

    // выберем все теги <img ...>
    ("""<img [^\>]*\>""" r).findAllIn(source.mkString)
      .toList.map(s => { // найдем тег src="..."
        ("""src=".*"""" r).findAllIn(s)
          .toList.map(s => { // по каждому тегу (он скорее всего один) взять всё что лежит внутри ""
              println(("""".*""" r).findFirstIn(s).get)
      })
    })
    source.close
  }
}
