/**
  * 将类的构造函数和类的创建放在一起
  * @param xc
  * @param yc
  *
  * 和类进行捆绑的是类的主构造函数
  */
class Point(xc : Int , yc : Int) {


  // constructor 这个构造函数不起作用，并且我不知道它是不是一个构造函数
  def Point() : Unit = {

  }



  // filed
  var x: Int = xc ;
  var y: Int = yc ;


  // method
  def move(dx : Int , dy : Int ): Unit ={
    x += dx ; y += dy
    print ("x坐标点： " + x  +" "+  "坐标点 : " + y)
    //很奇怪的是，下面的语句打印出来有"()"
    print("x坐标点： " + x ,  "坐标点 : " + y)
  }

  /**
    * 为什么在Class中创建object就不能运行main方法
    */
  object Test{
    def main(args: Array[String]): Unit = {
      null
    }
  }


}


class Location( val xc: Int , val yc : Int) extends Point(xc , yc ) {

  //如果你是想主动的override一个超类的filed或method，你需要使用override关键字

  //这条语句把超类的filed x y override
  override var x : Int = xc ;
  override var y : Int = yc ;


  // override 超类的move方法
  override def move(dx: Int, dy: Int): Unit = super.move(dx, dy)
}