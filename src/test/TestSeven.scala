package test

import main.Seven
import org.scalatest._

class TestSeven extends FlatSpec with Matchers {

  it should "Color conversion: RGB to GrayScale" in {
    val myRGB = Tuple3(25,215,137)
    val newGray = Tuple3(126,126,126)
    Seven.myConvert(myRGB) == newGray
  }
}
