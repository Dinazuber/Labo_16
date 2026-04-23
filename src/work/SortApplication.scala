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

    for(i <- arrays.indices){
      println("Before : ")
      display(arrays(i))
      println("Y sort : ")
      YSort.sort(arrays(i))
      display(arrays(i))
      println("------")
      println("Before : ")
      display(temp(i))
      println("Selection sort : ")
      selection.sort(temp(i))
      display(temp(i))
      println("----------------")
    }
  }
}
