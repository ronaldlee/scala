package example

class A {
  private var name = "John"

  private def sayLastname() = "Doe"
}

//companion object
object A {

  //can access private variable of A
  def sayName() = println(new A().name + " " + new A().sayLastname())
}

object Hello{
  def main(args:Array[String]) = {
    A.sayName()
  }
}
