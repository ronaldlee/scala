import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object Main extends App {

  def sleep(millis: Long) = {
    Thread.sleep(millis)
  }

  def doWork(index: Int) = {
    sleep((math.random*1000).toLong)
    index
  }

  (1 to 5) foreach {
    index =>
      val future = Future {
        doWork(index)
      }
      future onComplete{
        case Success(answer) => println(s"Success! returned: $answer")
        case Failure(exception) => println(s"Failure! returned: $exception")
      }
  }

  sleep(1000)
  println("Fin!")
}