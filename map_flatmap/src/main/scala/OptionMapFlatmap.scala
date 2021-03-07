object OptionMapFlatmap {

  val opt1 = Some("Hi")
  println("opt1.class: " + opt1.getClass)

  val opt1Map = opt1.map(_.toUpperCase)

  println("opt1.map: " + opt1Map)
  println("opt1.map.class: " + opt1Map.getClass)

  //val opt1MapFlatten = opt1Map.flatten
  val someOpt1Map = Some(opt1Map)
  println("someOpt1.map: " + someOpt1Map)
  println("someOpt1.map.class: " + someOpt1Map.getClass)
  val someOpt1MapFlatten = someOpt1Map.flatten
  println("someOpt1MapFlatten: " + someOpt1MapFlatten)

  val someSomeOpt1Map = Some(someOpt1Map)
  println("someSomeOpt1.map: " + someSomeOpt1Map)
  val someSomeOpt1MapFlatten = someSomeOpt1Map.flatten
  println("someSomeOpt1MapFlatten: " + someSomeOpt1MapFlatten)

  val opt1FlatMap = opt1.flatMap(s => Some(s.toUpperCase))
  println("opt1FlatMap: " + opt1FlatMap)

}
