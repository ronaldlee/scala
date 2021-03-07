object Main extends App {

  val t = ("hello", 1, 2.3)
  println("t: " + t)
  println("t1: " + t._1)
  println("t3: " + t._3)

  val (t1, t2, t3) = ("Yoo", 2, 4)
  println(s"t1:${t1}, t2:${t2}, t3:${t3}")

}