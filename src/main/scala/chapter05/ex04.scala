/**
  * Created by kirill on 29.09.2016.
  */

package chapter5 {
  object ex04 extends App {
    class Time (hours: Int, minutes: Int) {
      if (hours>23   || hours<0)   throw new IllegalArgumentException("Час можно задавать в диапазоне от 0 до 23")
      if (minutes>59 || minutes<0) throw new IllegalArgumentException("Минуты можно задавать в диапазоне от 0 до 59")
      val count = hours*60+minutes
      def before(other: Time): Boolean = count>other.count
    }

    assert(  new Time(13, 15).before(new Time(13, 0)))
    assert(!(new Time(13, 15).before(new Time(13, 15))))
    assert(!(new Time(13, 15).before(new Time(13, 17))))
  }
}
