/*package test

import main.Six
import org.scalatest._

import scala.collection.mutable

class TestSix extends FlatSpec with Matchers {

  it should "Multiplication of two matrices" in {
    val testMatrix = Six.mulMatrix(Array(Array(1, 0, 2,-1), Array(3,1,-2,4), Array(2,-1,0,2), Array(1,1,3,-3)),
      Array(Array(2,0,1,3), Array(-1,-3,2,1), Array(4,-1,0,2), Array(-4, 0,1,-2)),
      Array(Array(0,0,0,0), Array(0,0,0,0), Array(0,0,0,0), Array(0,0,0,0)))
    val needMatrix = Array(Array(14,-2,0,9), Array(-19,-1,9,-2), Array(-3,3,2,1), Array(25,-6,0,16))
    testMatrix.sameElements(needMatrix)
  }

  it should "Whether the transferred item enters the list" in {
    val checkList = List(0,-4,56,87,-10,78,8,4,-1)
    val elem1: Int = -4
    val elem2: Int = 12
    Six.containsFoldLeft(checkList, elem1) should be (true)
    Six.containsFold(checkList, elem2) should be (false)
  }

  it should "Keys that are not equal to the square root of their values" in {
    val oldMap = mutable.Map[Int, Int](1->1,2->6,3->4,4->16,5->25)
    val needMap = mutable.Map[Int, Int](5->25, 4->16, 1->1)
    Six.delKeys(oldMap) == needMap
  }
}*/