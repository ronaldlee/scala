import scala.annotation.tailrec

object Main extends App {

  def factorial(value:Int): Int = {
    @tailrec
    def fact(value:Int, result:Int):Int = {
      if (value == 1)
        result
      else
        fact(value-1, result*value)
    }
    fact(value, 1)
  }


  println("fac(4): " + factorial(4))
}