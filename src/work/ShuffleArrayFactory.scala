object ShuffleArrayFactory extends App with ArrayFactory {
  def create(size: Int): Array[Int] = {
    var shuffleArray: Array[Int] = new Array[Int](size)

    for (i <- 0 until size) {
      if (i % 2 == 0) shuffleArray(i) = i / 2
      else shuffleArray(i) = size - 1 - i / 2
    }
    return shuffleArray
  }
}
