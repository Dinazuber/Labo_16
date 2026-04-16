
object RandomArrayFactory extends App with ArrayFactory {
  val size : Int = 60
  var randomArray : Array[Int] = create(size)

  for(i<-0 until size){
    var randomNumber : Int = (math.random() * size).toInt
    randomArray(i) = randomNumber
  }
  print(randomArray.mkString(","))
}
