package example


case class Hello(name:String)

class Yoo(name:String)

class Boo(var name:String)

class Bee(val name:String)

object Main {
  def main(args:Array[String]) = {
    var hello = Hello("Joe")

    println(hello.name)

    val yoo = new Yoo("Mary")
    //not work, 'name' is 'val'
    //println(yoo.name)

    val boo = new Boo("Mary")
    println(boo.name)
    boo.name = "Tom"

    val bee = new Bee("Peter")
    println(bee.name)
    //not work, readonly
    //bee.name = "Tim"
  }

}
