/*package test

import main.Six
import org.scalatest._

import scala.collection.mutable

class TestSix extends FlatSpec with Matchers {

  it should "Exponentiation element with recursion" in {
    val num = 3
    val exp = 5
    Six.exponentRecursive(num, exp) should be(243)
  }

  it should "Exponentiation element with tail recursion" in {
    val num = 3
    val exp = 5
    Six.exponentTailRecursive(num, exp) should be(243)
  }

  it should "Find low numbers without recursion" in {
    val list = mutable.MutableList[Int](1,0,2,0,-1,-2,1,-5,6,-4)
    val newList = mutable.MutableList[Int]()
    val ans = mutable.MutableList[Int](-1,-2,-5)
    Six.lowNumNotRec(list, newList)
    for(i <- ans.indices){
      assert(newList(i) === ans(i))
    }
  }

  it should "Find low numbers with tail recursion" in {
    val list = mutable.MutableList[Int](1,0,2,0,-1,-2,1,-5,6,-4)
    val newList = Six.lowNumTailRec(list)
    val ans = mutable.MutableList[Int](-1,-2,-5)
    for(i <- ans.indices){
      assert(newList(i) === ans(i))
    }
  }
}
*/