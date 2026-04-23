object InvertedSortedArrayFactory extends App with ArrayFactory {
  override def create(size: Int): Array[Int] = {
    var invertedSortedArray : Array[Int] = new Array[Int](size)
    for(i<-0 until size){
      invertedSortedArray(i) = size-i-1
    }
    return invertedSortedArray
  }

}
