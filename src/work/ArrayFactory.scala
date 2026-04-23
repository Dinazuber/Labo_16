trait ArrayFactory {
  def create(size : Int) : Array[Int] = {
    var tab : Array[Int] = Array.ofDim(size)
    return tab
  }
}