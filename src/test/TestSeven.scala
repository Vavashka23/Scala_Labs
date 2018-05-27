package test

import main.Seven
import org.scalatest._

class TestSeven extends FlatSpec with Matchers {

  it should "Color conversion: RGB to GrayScale" in {
    val myRGB = Tuple3(25,215,137)
    val newGray = Tuple3(126,126,126)
    assert(Seven.myConvert(myRGB) == newGray)
  }

  it should "Calculating area function" in {
    val fig1 = Seven.Rectangle(12,2)
    val fig2 = Seven.Parallelepiped(4,7,9)
    assert(Seven.chooseFigure(fig1) == 24)
    assert(Seven.chooseFigure(fig2) == 254)
  }
}
