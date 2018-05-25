package main

import scala.collection.mutable

object Six {

  def main(args: Array[String]): Unit = {
    val newMatrix = mulMatrix(Array(Array(1, 0, 8), Array(-5, 4, 3), Array(2, -6, 1)),
      Array(Array(5, 1, -1), Array(7, 0, -4), Array(-5, 9, 2)),
      Array(Array(0,0,0), Array(0,0,0), Array(0,0,0)))
    for (i <- newMatrix.indices) {
      for (j <- newMatrix(0).indices)
        print(newMatrix(i)(j) + " ")
      println()
    }
    val newList = List(0,2,1,-4,8,40,48,45,7,8,9)
    val elem: Int = -4
    println(containsFoldLeft(newList, elem))
    println(containsFold(newList, elem))
    val oldMap = mutable.Map[Int, Int](1->1,2->4,3->4,4->5)
    val newMap = mutable.Map[Int, Int]()
    println(delKeys(oldMap, newMap))
  }

  def mulMatrix(matr1: Array[Array[Int]], matr2: Array[Array[Int]], matr3: Array[Array[Int]]): Array[Array[Int]]={
    for (i <- matr1.indices)
      for (j <- matr2(0).indices) {
        for (inner <- matr1(0).indices)
          matr3(i)(j) += matr1(i)(inner) * matr2(inner)(j)
      }
    matr3
  }

  def containsFoldLeft[A](list: List[Int], item: Int): Boolean =
    list.foldLeft(false)(_ || _==item)

  def containsFold(list: List[Int], item: Int): Boolean = {
    val check = list.fold(0)((m: Int, n: Int) => {if(n == item) m + 0
    else m + n})
    if(list.sum != check) true
    else false
  }

  def delKeys(map: mutable.Map[Int, Int], newMap: mutable.Map[Int, Int]):mutable.Map[Int, Int]= {
    map foreach {case (key, value) => if(key*key == value) newMap+=(key->value)}
    newMap
  }
}