
object SimpleTypesDeclare {

  //Three types A,B,C involved
  //take 3 params:
  //'a' is type A
  //'b' is type B
  //'f' is a function that takes A and B and return C
  //The apply function itself return C
  //It simply just call 'f'
  def apply[A, B, C](a:A, b:B, f:(A, B) => C):C = {
   f(a,b)
  }

}
