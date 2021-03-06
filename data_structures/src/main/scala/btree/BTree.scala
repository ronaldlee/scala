package btree

case class BTree(val rootNode:Node) {

  def insert(node:Node) = {
    insertNode(rootNode, node)
  }

  private def insertNode(node:Node, newNode:Node): Unit = {
    if (newNode.value >= node.value) {
      if (node.right == null)
        node.right = newNode
      else
        insertNode(node.right, newNode)
    } else {
      if (node.left == null)
        node.left = newNode
      else
        insertNode(node.left, newNode)
    }
  }

  def printTree():Unit = {
    printTree("", rootNode, 0)
  }

  private def printTree(label:String, node:Node, indent:Int): Unit = {
    println((' '.toString * indent) + indent + label + ":" + node.value.toString)
    var a = indent
    a += 1
    if (node.left != null)
      printTree("l",node.left, a)
    if (node.right != null)
      printTree("r",node.right, a)
  }

}
