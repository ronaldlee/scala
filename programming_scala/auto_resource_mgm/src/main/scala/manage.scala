import scala.language.reflectiveCalls
import scala.util.control.NonFatal

object manage {
  def apply[
    R <: { def close():Unit },
    T ]
  (resource: => R)
  (f: R => T) = {
    var res: Option[R] = None
    try {
      res = Some(resource)
      f(res.get)
    } catch {
      case NonFatal(ex) =>
        println("non fatal exception")
        throw ex
    } finally {
      if (res != None) {
        println("Closing resource")
        res.get.close
      }
    }
  }
}





