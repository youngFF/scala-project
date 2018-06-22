object Test {


  val f = (x : Int , y : Float) =>{
    println(x + " " + y)
  }


  def main(args: Array[String]): Unit = {
    f  //f相当于是一个变量，而不是一个函数，而f() 才是函数调用
  }
}
