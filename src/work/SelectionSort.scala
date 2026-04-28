object SelectionSort extends Sort {
  def sort(a: Array[Int]): Array[Int] = {
    var firstID : Int = 0
    var minId: Int = 0
    for(i: Int <- a.indices){
      for(j: Int <- i until a.length){
        if(a(minId) > a(j)){
          minId = j
        }
      }
      val tmp: Int = a(firstID)
      a(firstID) = a(minId)
      a(minId) = tmp
      firstID += 1
      minId = firstID
    }
    return a
  }
}
