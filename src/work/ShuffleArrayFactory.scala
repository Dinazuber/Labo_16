object ShuffleArrayFactory extends App with ArrayFactory {
  val size : Int = 60
  var shuffleArray : Array[Int] = create(size)

  for(i<-0 until size){
    if(i % 2 == 0) shuffleArray(i) = i/2
    else shuffleArray(i) = size-i/2
  }
  print(shuffleArray.mkString(","))
}
