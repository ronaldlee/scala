
class A(val name:String, val age:Int)

class B(override val name:String, override val age:Int, val sex:String) extends A(name, age) {

  def show(): Unit = {
    println("name: " + name + "; age: " + age + "; sex: " + sex)
  }
}

class C(var name:String)


object Main {

  def main(args:Array[String]): Unit = {
    println("yoo")

    val a = new A("Joe", 30)

    println("a name: " + a.name + "; age: " + a.age)

    val b = new B("Marry",20, "female")
    b.show()

    val c = new C("Tom")
    println("c name: " + c.name)

    c.name="Tim"
    println("c name after: " + c.name)
  }
}