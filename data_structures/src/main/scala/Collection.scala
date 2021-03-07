import scala.collection.mutable

object Collection {

  val array = Array(1,4,6,5)
  println("at index 0: " + array(0))
  println("at last: " + array.last)
  //array.foreach { println(_) }
  array.foreach { println }

  val a2 = array.map( a=>a+1)
  println("after +1")
  a2.foreach { println }

  val a3 = a2.filter( a => a %2 == 0)
  println("after filter 2's")
  a3.foreach { println }

  //merge 2 arrays
  println("merge 2 arrays")
  val aa1 = Array(1,2)
  val aa2 = Array(3,4)

  val aa3 = aa1.appendedAll(aa2)
  aa3.foreach { println }

  println("use for loop")
  //use for loop to traverse
  for (i <- 0 until aa3.length) {
    println(aa3(i))
  }

  println("List")
  val list = List(1, "b", "CC")
  list.foreach(println)

  //Map
  println("Map")
  val m = Map("a" -> 1, "b" -> 2)
  //m.foreach( println )
  m.keys.foreach( println )
  m.values.foreach( println )
  println("get map for key 'a': " + m.get("a").get)
  val m2 = m.updated("a", 3)
  //updated doesn't work
  println("get map for key 'a' after updated: " + m2.get("a").get)

  //MutableMap
  val mm = mutable.Map("a"->1,"b"->2)
  mm("a") = 3
  println("get mutable map for key 'a': " + mm.get("a").get)

  //ListBuffer
  val l = mutable.ListBuffer[String]()
  l += "Yoo"
  l += "Yee"
  l.foreach(println)

  println("get mutable list at 0: " + l(0))

  l.remove(0)
  println("after removed index 0")
  l.foreach(println)

  for (i <- 0 until l.length) {
    println("boo: " + l(i))
  }

  case class Node(name:String)

  val n = Node("Yoo")
  println("NN: " + n.name)

  val mm2 = Map[String, Node]("a" -> Node("Mary"))

  println("MM name: " + mm2.get("a").get.name)

  val mm3 = mutable.Map[String, Node]("a" -> Node("John"))

  println("MM3 name: " + mm3.get("a").get.name)
  mm3("a") = Node("Gary")
  println("MM3 name after update: " + mm3.get("a").get.name)


}
