import com.rl.benchmark.timer

object StringVsRegex {
  val delimitedStr = "Tom,John,Mary"

  def useRegex(str: String) = {
    val delimitedStrReg = """([^,]+)""".r
    val result = delimitedStrReg.findAllIn(str)
    result.foreach(println)
    result
  }

  def useSplitChar(str: String) = {
    val splitted:Array[String] = str.split(',')
    splitted.foreach(println)
    splitted
  }

  def useSplitRegex(str: String) = {
    val splitted:Array[String] = str.split(",")
    splitted.foreach(println)
    splitted
  }

  val (result, time) = timer(useRegex(delimitedStr))
  println("time use regex: " + time)

  val (result2, time2) = timer(useSplitChar(delimitedStr))
  println("time use split char: " + time2)

  //really fast!
  //Actually, internally when it detects it is just a single-char string
  //it doesn't use regex, but only uses 'indexOf' and loop thru it to get the tokens.
  val (result3, time3) = timer(useSplitRegex(delimitedStr))
  println("time use split regex: " + time3)
}
