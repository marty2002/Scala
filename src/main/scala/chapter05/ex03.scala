/**
  * Created by kirill on 29.09.2016.
  */

package chapter5 {
  object ex03 extends App {
    class Time (private val hours: Int, private val minutes: Int) {
      if (hours>23   || hours<0)   throw new IllegalArgumentException("Час можно задавать в диапазоне от 0 до 23")
      if (minutes>59 || minutes<0) throw new IllegalArgumentException("Минуты можно задавать в диапазоне от 0 до 59")
      def before(other: Time): Boolean = hours>other.hours || (hours==other.hours && minutes>other.minutes)
    }

    assert(  new Time(13, 15).before(new Time(13, 0)))
    assert(!(new Time(13, 15).before(new Time(13, 15))))
    assert(!(new Time(13, 15).before(new Time(13, 17))))
  }
}

