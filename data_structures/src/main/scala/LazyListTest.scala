object LazyListTest {
  var l = LazyList("1", "2", "3")
  l = "0" +: l
  println("lazy list: " + l)
  l.foreach(println)

  //use cons function
  l = LazyList.cons("1", LazyList("2", "3"))

  //append
  println("append:")
  l = l :+ "4"
  l.foreach(println)

}
