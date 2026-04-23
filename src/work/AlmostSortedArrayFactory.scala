object AlmostSortedArrayFactory extends App with ArrayFactory {
  override def create(size: Int): Array[Int] = {
    val percentage: Int = 50
    var almostSortedArray: Array[Int] = (0 until size).toArray
    val swap: Int = (size * percentage) / 100

    for (i <- 0 to size - 1) {
      if (i >= size - swap) {
        var j: Int = (size - swap) + (math.random() * swap).toInt
        val tmp: Int = almostSortedArray(i)
        almostSortedArray(i) = almostSortedArray(j)
        almostSortedArray(j) = tmp
      }
    }
    return almostSortedArray
  }
}