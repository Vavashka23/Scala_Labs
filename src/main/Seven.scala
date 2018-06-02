package main

object Seven {

  def main(args: Array[String]): Unit = {
    val myColor = Tuple3(30, 128, 255)
    val myCMYk = Tuple4(0.0, 0.82, 0.82, 0.28)
    println(myConvert(myColor))
    val rec = Rectangle(12,13)
    val parallelepiped = Parallelepiped(10,11,4)
    chooseFigureKek(rec)
    chooseFigureKek(parallelepiped)
    chooseColorTup(myCMYk)
  }

  def toRGBColor(old: (Double, Double, Double, Double)):(Int, Int, Int) ={
    val newColor = Tuple3((255*(1-old._1)*(1-old._4)).toInt, (255*(1-old._2)*(1-old._4)).toInt, (255*(1-old._3)*(1-old._4)).toInt)
    newColor
  }

  def myConvert(old: (Int, Int, Int)): (Int, Int, Int) = {
    val result: Int = (old._1+old._2+old._3)/3+1
    val newColor = Tuple3(result, result, result)
    newColor
  }

  def chooseColorTup(obj: AnyRef ) =
  obj match{
    case obj:(Int, Int, Int) => println(myConvert(obj))
    case obj:(Double, Double, Double, Double) => println(myConvert(toRGBColor(obj)))
    case _ => println("blablabla")
  }

  def chooseFigureKek(obj: AnyRef)=
    obj match {
      case obj:Rectangle => println(sFig(obj.unapply(obj)))
      case obj:Parallelepiped => println(sFig(obj.unapply(obj)))
      case _ => println("nothing")
    }

  case class Rectangle(a:Int, b:Int) {
    def unapply(arg: Rectangle): Option[(Int, Int, Int)] = {
      Some(arg.a, arg.b, 0)
    }
  }

  case class Parallelepiped(a:Int, b:Int, c:Int) {
    def unapply(arg: Parallelepiped): Option[(Int, Int, Int)] = {
      Some(arg.a, arg.b, arg.c)
    }
  }

  def sFig(param: Option[(Int, Int, Int)]):Int ={
    if(param.get._3 == 0)
      {
        val s: Int = param.get._1*param.get._2
        s
      } else {
      val s: Int = 2 * (param.get._1 * param.get._2 + param.get._1 * param.get._3 + param.get._2 * param.get._3)
      s
    }
  }
}