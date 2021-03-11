object Main extends App {

  val a:String = "Hello"
  val b:Int = 10
  val f = (a:String, b:Int) => a + b.toString
  //b type is wrong, compile error
  //val f = (a:String, b:String) => a + b
  val c = SimpleTypesDeclare(a,b,f)
  println("c: " + c)



}