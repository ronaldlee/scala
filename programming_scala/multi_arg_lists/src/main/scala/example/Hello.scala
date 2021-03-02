package example

object Hello {

  def say1(msg:String)= {
    msg
  }

  def say(msg:String)(secMsg:String) = {
    msg + " " + secMsg
  }

  def say3Things(msg:String)(secMsg:String)(thirdMsg:String) = {
    msg + " " + secMsg + " " + thirdMsg
  }

  def main(args:Array[String]): Unit = {

    println(say("Hello")("joe"))
    println(say("Hello"){
      "joe2"
    })
    //this not work
    //println(say("HelloOnly"))

    println(say3Things("Hello"){
      "Tom"
    }("Ha!"))

    println(say3Things("Hello"){
      "Tom2"
    }{"Ha!"})

    println(say3Things{"Hello"}{
      "Tom3"
    }{"Ha!!"})

    println(say1("Yoo"))
    println(say1{"Yoo2"})

  }
}
