package work

class SelectionSort extends Sort {
  override def sort(a: Array[Int]): Array[Int] = {
    for(i: Int <- 0 until a.length){
      var temp : Int = a(i)
      var minId: Int = i
      for(j: Int <- i until a.length){
        if(a(minId) > a(j)){
          minId = j
        }
      }
      a(i) = a(minId)
      a(minId) = temp
    }
    return a
  }
}
