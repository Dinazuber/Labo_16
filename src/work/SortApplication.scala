object SortApplication {
  def display(a : Array[Int]) : Unit = {
    println(a.mkString(","))
  }
  def main(args : Array[String]) : Unit = {
    val size : Int = 10000
    var almostSortedArray :  Array[Int] = AlmostSortedArrayFactory.create(size)
    var invertedSortedArray :  Array[Int] = InvertedSortedArrayFactory.create(size)
    var randomArray :  Array[Int] = RandomArrayFactory.create(size)
    var shuffleArrayFactory :  Array[Int] = ShuffleArrayFactory.create(size)
    //print(almostSortedArray.mkString(",") + '\n' + invertedSortedArray.mkString(",") + '\n' +
    //  randomArray.mkString(",") + '\n' + shuffleArrayFactory.mkString(","))
    var arrays : Array[Array[Int]] = Array(almostSortedArray, invertedSortedArray, randomArray, shuffleArrayFactory)
    var temp = arrays.map(_.clone()) //Deep clone of the table

    testAlgo(arrays, temp)
  }

  /**
   * Doing 1 test of the 2 algorithms
   * @param a Table of numbers
   * @param b Same table but must be a clone of A for better result
   */
  private def testAlgo(a : Array[Array[Int]], b : Array[Array[Int]]) : Unit = {

    for(i <- a.indices){
      println("Y sort : ")
      var start = System.nanoTime()
      YSort.sort(a(i))
      var stop = System.nanoTime()
      println(s"Time spended : ${stop-start} nanoseconds")
      println(s"Time spended : ${(stop-start)/math.pow(10,6)} ms")
      println("------")
      println("Selection sort : ")
      start = System.nanoTime()
      SelectionSort.sort(b(i))
      stop = System.nanoTime()
      println(s"Time spended : ${stop-start} nanoseconds")
      println(s"Time spended : ${(stop-start)/math.pow(10,6)} ms")
      println("----------------")
    }
  }
}
