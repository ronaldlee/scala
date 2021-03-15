object ListTest {
  val l = Vector("A", "B", "C", "D", "E")

  println("head: "  + l.head)
  println("tail: " + l.tail)

  val l2 = l.sliding(2,3).toList
  println("slide: " + l2)

}
