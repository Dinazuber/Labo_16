class SortApplication {
  def display(a : Array[Int]) : Unit = {
    print(a.mkString(","))
  }
  def main(args : Array[String]) : Unit = {
    val size : Int = 10
    var almostSortedArray :  Array[Int] = AlmostSortedArrayFactory.create(size)
    var invertedSortedArray :  Array[Int] = InvertedSortedArrayFactory.create(size)
    var randomArray :  Array[Int] = RandomArrayFactory.create(size)
    var shuffleArrayFactory :  Array[Int] = ShuffleArrayFactory.create(size)
    print(almostSortedArray.mkString(",") + '\n' + invertedSortedArray.mkString(",")
      + randomArray.mkString(",") + shuffleArrayFactory.mkString(","))
  }
}
