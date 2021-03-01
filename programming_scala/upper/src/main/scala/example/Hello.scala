package example

object Upper {
  def upper(strings: String*):Seq[String] = {

    //strings is a mutable.WrappedArray
    println("what is strings? " + strings.getClass.getName)
    //strings.map((s:String) => s.toUpperCase)
    strings.map(_.toUpperCase)

  }
}

object Main {

  def main(args:Array[String]) = {
     println(Upper.upper("Hello", "Joe"))
  }

}

