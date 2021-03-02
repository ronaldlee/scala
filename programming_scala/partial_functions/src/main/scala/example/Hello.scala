package example

object Hello {

  val pfA:PartialFunction[String, String] = {
    case "A" => "AAAA"
  }

  val pfB:PartialFunction[String, String] = {
    case "B" => "AAAA"
  }

  val pfAB = pfA orElse pfB

  def main(args:Array[String]): Unit = {
    if (pfA.isDefinedAt("A")) {
      println("A is defined!")
    }
    else {
      println("A is NOT defined")
    }

    if (pfA.isDefinedAt("B")) {
      println("B is defined!")
    }
    else {
      println("B is NOT defined")
    }

    if (pfAB.isDefinedAt("B")) {
      println("B is defined by pfAB!")
    }
    else {
      println("B is NOT defined by pfAB")
    }
  }

}
