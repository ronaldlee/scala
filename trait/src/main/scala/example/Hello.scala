package example

/**
 * This shows how a variable defined by a class can be shared to the other traits that it extends/with.
 */

object AB extends A with B {
  var name:String = "AB"

  //override a 'var' not possible
  //override var name:String = "AB"

}

object Hello {

  def main(args:Array[String]) = {

    println("say from SuperA: " + AB.sayFromSuperA())
    println("say from A: " + AB.sayfromA())
    println("say from B: " + AB.sayfromB())

  }

}

