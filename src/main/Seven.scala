package main

object Seven {

  def main(args: Array[String]): Unit = {
    val myColor = Tuple3(30, 128, 255)
    println(myConvert(myColor))
  }

  def myConvert(old: (Int, Int, Int)): (Int, Int, Int) = {
    val result: Int = (old._1+old._2+old._3)/3+1
    val newColor = Tuple3(result, result, result)
    newColor
  }
}