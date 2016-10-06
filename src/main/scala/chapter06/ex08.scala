/**
  * Created by kirill on 30.09.2016.
  */

package chapter6 {
  object ex08 extends App {

    object RGB extends Enumeration {
      type RGB = Value
      val White   = Value(0xFFFFFF)
      val Cyan    = Value(0x00FFFF)
      val Green   = Value(0x00FF00)
      val Yellow  = Value(0xFFFF00)
      val Red     = Value(0xFF0000)
      val Magenta = Value(0xFF00FF)
      val Blue    = Value(0x0000FF)
      val Black   = Value(0x000000)
    }

    assert(RGB.White.id   == 0xFFFFFF)
    assert(RGB.Cyan.id    == 0x00FFFF)
    assert(RGB.Green.id   == 0x00FF00)
    assert(RGB.Yellow.id  == 0xFFFF00)
    assert(RGB.Red.id     == 0xFF0000)
    assert(RGB.Magenta.id == 0xFF00FF)
    assert(RGB.Blue.id    == 0x0000FF)
    assert(RGB.Black.id   == 0x000000)
  }
}

