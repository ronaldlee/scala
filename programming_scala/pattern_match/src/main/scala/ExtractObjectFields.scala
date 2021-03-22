object ExtractObjectFields {
  case class Address(street:String, city:String, country:String)
  case class Person(name:String, age:Int, address:Address)

  val Person(name, age, Address(_, state, _)) = Person("Dean", 29, Address("1 Scala Way", "CA", "USA"))

  println(s"name: $name; age: $age; state: $state")

  //list

  val head +: tail = List(1,2,3)
  println("head: " + head + "; tail: " + tail)

}
