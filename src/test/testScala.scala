package test

import main.Fifth
import org.scalatest._
import org.scalatest.matchers._

import scala.collection.mutable

/*class ExampleSpec extends FlatSpec with Matchers {

  it should "sum elements of list" in {
    val list = mutable.MutableList[Int](1,2,3)
    Fifth.sumList(list) should be (6)
  }

/*  it should "sum elements of list recursive" in {
    val list = List[Int](1,2,3)
    Fifth.sumRecursive(list, list.length) should be(6)
  }

  it should "sum elements of list tail recursive" in {
    val list = List[Int](1,2,3)
    Fifth.sumTailRecursive(list) should be (6)
  }
*/
  it should "Fing num tail recursive" in {
    val list = mutable.MutableList[Int](1, 2, 0, 0, -3)
    val newList = mutable.MutableList[Int]()
    val ans = mutable.MutableList[Int](0,0,-3)
    Fifth.bigNumNotRec(list, newList)
    for(i <- 0 to ans.size - 1){
      assert(newList(i) === ans(i))
    }
  }
}*/