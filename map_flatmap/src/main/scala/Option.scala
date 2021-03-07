object Option {
  case class Node(value:Int, left:Option[Node]=None, right:Option[Node]=None)

  val n1 = Node(10,Some(Node(12,None,None)),None)

  val n1LeftValue= n1.left match {
    case Some(n) => n.value
  }

  println("n1LeftValue: " + n1LeftValue)

  println("n1Left get: " + n1.left.get.value)

  println("n1Left getOrElse: " + n1.left.getOrElse(Node(-1)).value)

  println("n1Right getOrElse: " + n1.right.getOrElse(Node(-1)).value)

}
