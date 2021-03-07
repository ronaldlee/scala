object Collection {

  val list = List("Apple", "Book", "Cat")
  println("list: " + list)

  val listMap = list. map(s => s + s)

  println("list map: " + listMap)

  val listFlatmap = list.flatMap(s => s + s)

  println("list flatmap: " + listFlatmap)

  val listMapFlatten = list.map(s=>s+s).flatten

  println("list map then flatten: " + listMapFlatten)


  val listSomeNone = List(Some("A"), Some("B"), None, Some("C"), None)
  val listSomeNoneFlatten = listSomeNone.flatten

  println("listSomeNone flatten: " + listSomeNoneFlatten)


}
