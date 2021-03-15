
class Address(_street:String) {
  private val street:String = _street
}

object Address {
  def apply(street: String) = {
    new Address(street)
  }

  def unapply(a: Address):Option[(String)] = {
    Some((a.street))
  }
}

class Person(_name:String, _age: Int, _address: Address) {
  private val name = _name
  private val age = _age
  private val address = _address

  def hello = println("Hello I am " + name)
}

object Person {
  def apply(name: String, age: Int, address: Address) = {
    println("call Person apply: name: " + name)
    new Person(name, age, address)
  }

  def unapply(p: Person):Option[(String, Int, Address)] = {
    Some((p.name, p.age, p.address))
  }
}
