package test

import main.Six
import org.scalatest._

class TestSix extends FlatSpec with Matchers {

  it should "Multiplication of two matrices" in {
    val testMatrix = Six.mulMatrix(Array(Array(1, 0, 2,-1), Array(3,1,-2,4), Array(2,-1,0,2), Array(1,1,3,-3)),
      Array(Array(2,0,1,3), Array(-1,-3,2,1), Array(4,-1,0,2), Array(-4, 0,1,-2)),
      Array(Array(0,0,0,0), Array(0,0,0,0), Array(0,0,0,0), Array(0,0,0,0)))
    val needMatrix = Array(Array(14,-2,0,9), Array(-19,-1,9,-2), Array(-3,3,2,1), Array(25,-6,0,16))
    assert(testMatrix.sameElements(needMatrix))
  }

  it should "Whether the transferred item enters the list" in {
    val checkList = List(0,-4,56,87,-10,78,8,4,-1)
    val elem1: Int = -4
    val elem2: Int = 12
    Six.contains(checkList, elem1) should be (true)
    Six.contains(checkList, elem2) should be (false)
  }
}