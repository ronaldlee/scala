object Sliding {
  val seq = Seq(1,2,3,4,5)
  val seq2 = seq.sliding(2)

  val s1 = seq2.toSeq
  println("s1 class: " + s1.getClass)

  for (s <- s1) {
    println("s: " + s)
  }

  //stream (deprecated)
  val v = Vector(1,2,3,4,5)
  println("v tostream: " + v.toStream.getClass)

  //use LazyList
  val toLazyList = v.to(LazyList)
  println("to lazylist class: " + toLazyList.getClass)
  println("to lazylist: " + toLazyList)

  toLazyList.foreach( println )
}
