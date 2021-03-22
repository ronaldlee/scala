object Apply {
  println("Hello, World!")

  val address:Address = new Address("1 main street")
  val person = Person("John", 20, address)
  person.hello

  //new class instance don't call apply
  val p = new Person("Mary", 18, address)


  person match {
    case Person("John", _, Address("1 main street")) => println("Matched John!")
  }
}
