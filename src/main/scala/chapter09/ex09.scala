/**
  * Created by kirill on 06.10.2016.
  */

package chapter9 {

  import java.io.File

  object ex09 extends App {
    def subdirs(dir: File): Iterator[File] = {
      val children = dir.listFiles.filter(_.isDirectory)
      children.toIterator ++ children.toIterator.flatMap(subdirs(_))
    }

    var res = subdirs(new File("out\\")).foldLeft(0){
      case (t, dir) => {
        t + dir.listFiles.filter(f => f.getName.matches(".*(.class)\\b")).toList.length
      }
    }
    println(res)
  }
}
