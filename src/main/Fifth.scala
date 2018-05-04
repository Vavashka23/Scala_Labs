package main

import scala.annotation.tailrec
import scala.collection.mutable

object Fifth{
  def main(args: Array[String]): Unit = {
    val list = List[Int](1,2,3,4,5,6,7,8)
    val list1 = mutable.MutableList[Int](1,0,2,0,-1,-2,1,-5,6,-4)
    val list2 = mutable.MutableList[Int]()
    println(bigNumNotRec(list1, list2))
    println(bigNumTailRec(list1))

  }

  def sumRecursive(list: List[Int],size: Int): Int = {
    if(size > 0) list(size - 1) + sumRecursive(list, size - 1)
    else 0
  }

  def sumTailRecursive(list: List[Int]): Int = {
    @tailrec
    def sumIter(list: List[Int], acc:Int, index:Int):Int={
      if(index < list.length) sumIter(list, list(index) + acc, index+1)
      else acc
    }
    sumIter(list, 0, 0)
  }

  def bigNumNotRec(oldList: mutable.MutableList[Int], newList: mutable.MutableList[Int]): mutable.MutableList[Int] = {
    for(i <- 2 to oldList.size - 1){
      if(oldList(i) < (oldList(i - 2) - oldList(i - 1))) newList += oldList(i)
    }
    newList
  }

  def bigNumTailRec(oldList: mutable.MutableList[Int]): mutable.MutableList[Int] = {
    @tailrec
    def find(oldList: mutable.MutableList[Int], newList: mutable.MutableList[Int], index: Int): mutable.MutableList[Int] = {
      if (index < oldList.size) {
        isValueTrueAdd(newList, oldList(index - 1), oldList(index), oldList(index - 2))
        find(oldList, newList, index + 1)
      }
      else {
        newList
      }
    }
    def isValueTrueAdd(newList: mutable.MutableList[Int], valuePrev: Int, value: Int, valuePrevPrev: Int): Unit = {
      if ((valuePrevPrev - valuePrev) > value) {
        newList += value
      }
    }
    if (oldList.size > 2) {
      find(oldList, mutable.MutableList(), 2)
    }
    else {
      mutable.MutableList()
    }
  }
}
