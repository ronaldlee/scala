object ForComprehension {

  val l = List("A","B","C")

  val result = for {
    value <- l
    if value.contains("A") || value.contains("B")
  } yield value

  println("Use Guard")
  println("result: " + result)

  //value defined in for-comprehension
  println("Lowercase")
  val r2 = for {
    value <- l
    lowerCase <- value.toLowerCase
  } yield lowerCase

  println("r2: " + r2)

  //list of options with Some's an None's
  println("List of some's and none's")
  val l3 = List(Some("C"), None, Some("B"), None, None, Some("A"))

  val l4 = for {
    Some(value) <- l3
    //either <- or = will work, but = is more accurate
    //<- is usually for iterator
    //value2 = value.toLowerCase
    value2 <- value.toLowerCase
  } yield value2

  println("l3: " + l4)



}
