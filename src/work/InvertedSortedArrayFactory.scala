object InvertedSortedArrayFactory extends App with ArrayFactory {
  val size : Int = 60
  var invertedSortedArray : Array[Int] = create(size)
  for(i<-0 until size){
    invertedSortedArray(i) = size-i-1
  }
  print(invertedSortedArray.mkString(","))
}
