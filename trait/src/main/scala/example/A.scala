package example

trait A extends SuperA {
  var name:String
  //this not work, whoever extends the trait will need to override the var which is not possible.
  //var name:String = "A"

  def sayfromA() = name
}
