object Task_8 extends App {
  def getShortTime(sortType: Sort, array: Array[Int]): Double = {
    val start = System.nanoTime()
    sortType.sort(array)
    val end = System.nanoTime()

    val totalTime = (end - start) / math.pow(10,9) //On divise par 10^9 pour avoir le temps en secondes
    println(s"Total time : ${totalTime}")
    return totalTime
  }

  def findSize(sortType: Sort, arrayType: ArrayFactory, timeToFind: Int): Int = {
    //On crée un tableau de 10k avec le type de factory voulu de l'utilisateur
    var lowerSize : Int = 1
    var higherSize: Int = 10000
    var result : Int = lowerSize
    var elements: Array[Int] = arrayType.create(higherSize)

    //On va augmenter la taille de 2 fois a chaque fois que le temps d'execution et plus petit que le temps que le
    //user souhaite avoir
    while(getShortTime(sortType, elements) < timeToFind){
      higherSize *= 2
      elements = arrayType.create(higherSize)
    }

    while(lowerSize <= higherSize){
      var midSize = (lowerSize + higherSize) / 2
      elements = arrayType.create(midSize)
      val time = getShortTime(sortType, elements)
      println(s"${time}")

      if(time <= (0.1 * timeToFind) + timeToFind && time >= timeToFind - (0.1 * timeToFind)){
        result = midSize
        return result
      }
      else if(time < timeToFind){
        lowerSize = midSize + 1
      } else {
        higherSize = midSize - 1
      }
    }
    result
  }

  println(s"The result : ${findSize(SelectionSort, InvertedSortedArrayFactory, 1)}")
}
