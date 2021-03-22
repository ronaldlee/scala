import scala.::

object ListTest {
//  val l = Vector("A", "B", "C", "D", "E")
//
//  println("head: "  + l.head)
//  println("tail: " + l.tail)
//
//  val l2 = l.sliding(2,3).toList
//  println("slide: " + l2)

  //prepend list
  var l = List("A", "B")
  l = "1" :: l
  println("prepend: " + l)

  //append
  l = l :+ "C"
  println("append: " + l)

  //prepend with +:
  l = "0" +: l
  println("prepend: " + l)

}
