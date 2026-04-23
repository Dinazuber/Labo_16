
object RandomArrayFactory extends App with ArrayFactory {
  override def create(size: Int): Array[Int] = {
    var randomArray: Array[Int] = new Array[Int](size)

    for (i <- 0 until size) {
      var randomNumber: Int = (math.random() * size).toInt
      randomArray(i) = randomNumber
    }
    return randomArray
  }
}
