


object Main extends App {
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

}