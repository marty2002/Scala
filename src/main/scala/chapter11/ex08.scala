/**
  * Created by kirill on 21.12.2016.
  */
package chapter11 {
  object ex08 extends App {

    class Matrix (val items: Array[Array[Int]]) {
      private val length = items.length

      def * (other: Matrix): Matrix =
       Matrix((0 until this.length)
         .map(i => (0 until this.length)
           .map(j => (0 until this.length)
             .map(k => this.items(i)(k) * other.items(k)(j)).sum)
           .toArray)
         .toArray)

      def * (scol: Int) :Matrix =
        Matrix((0 until this.length)
          .map(i => (0 until this.length)
            .map(j => this.items(i)(j) * scol).toArray)
          .toArray)

      def + (other: Matrix) :Matrix =
        Matrix((0 until this.length)
          .map(i => (0 until this.length)
            .map(j => this.items(i)(j) + other.items(i)(j)).toArray)
          .toArray)

      def mat(row: Int, col: Int): Int = {
        if (this.items.isDefinedAt(row) && this.items(col).isDefinedAt(col)) {
          return this.items(row)(col)
        } else {
          0
        }
      }

      override def toString: String = (0 until this.length).map(i => this.items(i).mkString(", ")).mkString("\r\n")
    }

    object Matrix {
      def apply(items: Array[Array[Int]]): Matrix = new Matrix(items)
    }

    val m1: Matrix = new Matrix(Array(Array(1, 2), Array(3, 4)))
    val m2: Matrix = new Matrix(Array(Array(1, 2), Array(3, 4)))


    assert((m1 * 3).items.deep   == Array(Array(3,  6), Array( 9, 12)).deep)
    assert((m1 * m2).items.deep  == Array(Array(7, 10), Array(15, 22)).deep)
    assert((m1 + m2).items.deep  == Array(Array(2,  4), Array( 6,  8)).deep)
    assert( m1.mat(1, 0) == 3)
  }
}
