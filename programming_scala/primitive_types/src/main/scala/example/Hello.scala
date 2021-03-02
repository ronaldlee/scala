package example

object Hello {

  def main(args:Array[String]) = {
    if (100.0.equals(100.0)) {
      println("Equal")
    }
    else {
      println("Not equal")
    }

    println("value: " + 100.0.toString)
  }

}