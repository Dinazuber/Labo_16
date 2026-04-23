object SortApplication {
  def display(a : Array[Int]) : Unit = {
    println(a.mkString(","))
  }
  def main(args : Array[String]) : Unit = {
    val size : Int = 10
    val selection : Sort = new SelectionSort()
    var almostSortedArray :  Array[Int] = AlmostSortedArrayFactory.create(size)
    var invertedSortedArray :  Array[Int] = InvertedSortedArrayFactory.create(size)
    var randomArray :  Array[Int] = RandomArrayFactory.create(size)
    var shuffleArrayFactory :  Array[Int] = ShuffleArrayFactory.create(size)
    //print(almostSortedArray.mkString(",") + '\n' + invertedSortedArray.mkString(",") + '\n' +
    //  randomArray.mkString(",") + '\n' + shuffleArrayFactory.mkString(","))
    var arrays : Array[Array[Int]] = Array(almostSortedArray, invertedSortedArray, randomArray, shuffleArrayFactory)
    var temp = arrays.map(_.clone()) //Deep clone of the table

    testAlgo(arrays, temp, selection)
  }

  /**
   * Doing 1 test of the 2 algorithms
   * @param a Table of numbers
   * @param b Same table but must be a clone of A for better result
   * @param selection Your selection sort code!
   */
  def testAlgo(a : Array[Array[Int]], b : Array[Array[Int]], selection: Sort) : Unit = {

    for(i <- a.indices){
      println("Before : ")
      display(a(i))
      println("Y sort : ")
      YSort.sort(a(i))
      display(a(i))
      println("------")
      println("Before : ")
      display(b(i))
      println("Selection sort : ")
      selection.sort(b(i))
      display(b(i))
      println("----------------")
    }
  }
}
