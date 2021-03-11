object whileLoop {

  def apply(condition: => Boolean)(body: => Unit):Unit = {
    if (condition) {
      body
      apply(condition)(body)
    }
  }

}
