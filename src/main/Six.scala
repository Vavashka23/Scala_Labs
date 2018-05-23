package main


object Six {

  def main(args: Array[String]): Unit = {
    val newMatrix = mulMatrix(Array(Array(1, 0, 8), Array(-5, 4, 3), Array(2, -6, 1)), Array(Array(5, 1, -1), Array(7, 0, -4), Array(-5, 9, 2)), Array(Array(0,0,0), Array(0,0,0), Array(0,0,0)))

    for (i <- newMatrix.indices)
      for (j <- newMatrix(0).indices)
        println(newMatrix(i)(j))


  }

  def mulMatrix(matr1: Array[Array[Int]], matr2: Array[Array[Int]], matr3: Array[Array[Int]]): Array[Array[Int]]={
    for (i <- matr1.indices)
      for (j <- matr2(0).indices) {
        matr3(i)(j) = 0
        for (inner <- matr1(0).indices)
          matr3(i)(j) += matr1(i)(inner) * matr2(inner)(j)
      }
    matr3
  }
}