package main

import scala.annotation.tailrec
import scala.collection.mutable

object Fifth{
  def main(args: Array[String]): Unit = {
    val exponent = 4;
    val number = 5;
    val list1 = mutable.MutableList[Int](1,0,2,0,-1,-2,1,-5,6,-4)
    val list2 = mutable.MutableList[Int]()
    println(exponentRecursive(number,exponent))
    println(exponentTailRecursive(number, exponent))
    println(bigNumNotRec(list1, list2))
    println(bigNumTailRec(list1))

  }

  def exponentRecursive(number: Int,exponent: Int): Int = {
    if(exponent > 0) number * exponentRecursive(number, exponent - 1)
    else 1
  }

  def exponentTailRecursive(number: Int, exponent: Int): Int = {
    @tailrec
    def expIter(num: Int, exp: Int, index:Int, answer: Int):Int={
      if(exp > 0) {
        if (index < exp) expIter(num, exp, index + 1, answer * num)
        else answer
      } else 1
    }
    expIter(number, exponent, 0 , 1)
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
