object RightAssociative {

  val l = List("1", "2", "3")
  val l2 = "a" :: l

  println("l2 : " + l2)

  val l3 = l.::("a")

  println("l3 : " + l3)
}
