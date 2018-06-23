
/**
  * 直接把类的构造方法放在类的定义上面
  * @param x
  * @param y
  */
class Point(x:Int , y : Int) {
  //表明这个x是类Point的一个成员属性
  var x1 = x ;
  //表明这个y是类Point的一个成员属性
  var y1 = y ;


  def move(dx : Int , dy : Int ) : Unit ={
    this.x1 = x + dx ;
    this.y1 = y + dy ;
    println("x : " + x + " " + "y : " + y)

  }



  object Test{
    def main(args: Array[String]): Unit = {
      var 
    }
  }
}
