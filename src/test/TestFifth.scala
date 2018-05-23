/*package test

import main.Fifth
import org.scalatest._

import scala.collection.mutable

class TestFifth extends FlatSpec with Matchers {

  it should "Exponentiation element with recursion" in {
    val num = 3
    val exp = 5
    Fifth.exponentRecursive(num, exp) should be(243)
  }

  it should "Exponentiation element with tail recursion" in {
    val num = 3
    val exp = 5
    Fifth.exponentTailRecursive(num, exp) should be(243)
  }

  it should "Find low numbers without recursion" in {
    val list = mutable.MutableList[Int](1,0,2,0,-1,-2,1,-5,6,-4)
    val newList = mutable.MutableList[Int]()
    val ans = mutable.MutableList[Int](-1,-2,-5)
    Fifth.lowNumNotRec(list, newList)
    for(i <- 0 to ans.size - 1){
      assert(newList(i) === ans(i))
    }
  }

  it should "Find low numbers with tail recursion" in {
    val list = mutable.MutableList[Int](1,0,2,0,-1,-2,1,-5,6,-4)
    val newList = Fifth.lowNumTailRec(list)
    val ans = mutable.MutableList[Int](-1,-2,-5)
    for(i <- 0 to ans.size - 1){
      assert(newList(i) === ans(i))
    }
  }
}*/