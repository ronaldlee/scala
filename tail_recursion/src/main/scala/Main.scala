import scala.annotation.tailrec



object Main extends App {
  def factorial(n: Int): Int = {
    @tailrec
    def iter(x:Int, result:Int):Int =
      if (x == 1) result
      else iter(x-1, result*x)

    iter(n, 1)
  }

  println("f(3): "  + factorial(3))
  println("f(4): "  + factorial(4))
}