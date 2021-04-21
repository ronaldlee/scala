import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}
import scala.util.{Failure, Success}

object ForComprehension {

  val l = List("A","B","C")

  val result = for {
    value <- l
    if value.contains("A") || value.contains("B")
  } yield value

  println("Use Guard")
  println("result: " + result)

  //value defined in for-comprehension
  println("Lowercase")
  val r2 = for {
    value <- l
    lowerCase <- value.toLowerCase
  } yield lowerCase

  println("r2: " + r2)

  //list of options with Some's an None's
  println("List of some's and none's")
  val l3 = List(Some("C"), None, Some("B"), None, None, Some("A"))

  val l4 = for {
    Some(value) <- l3
    //either <- or = will work, but = is more accurate
    //<- is usually for iterator
    //value2 = value.toLowerCase
    value2 <- value.toLowerCase
  } yield value2

  println("l3: " + l4)

  //for-comprehension on None
  println("For-comprehension on None")
  for {
    value <- None
  } println("Should not get here: " + value)
  for (value <- None) {
    println("Should not get here: " + value)
  }

  //on Future
  val r3 = for {
    v1 <- Future(Some(true))
    //_ <- {println("RR v1: " + v1); Future()}
    r1 = v1.getOrElse(false)
  } yield r1

  println("for-comp future: result: " + r3)

  //Await.result(r3, Duration.Inf)

  /*
  r3 onComplete {
    case Success(_) => println("success: " + _)
    case Failure(exception) => println("fail: " + exception)
  }
   */



}
