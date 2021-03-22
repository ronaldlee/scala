package com.rl.benchmark

object timer {
  def apply[T](doStuff: => T) = {
    val startTime = System.nanoTime
    val result = doStuff
    val stopTime = System.nanoTime
    val delta = stopTime - startTime
    (result, delta / 1000000d)
  }
}
