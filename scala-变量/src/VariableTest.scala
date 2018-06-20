object VariableTest {


  def main(args: Array[String]): Unit = {
    //类型自动推断
    var p1 = 10

    var p2 = "foo"

    // 空值
    var p3 = null ;

    var p4 : String = "this is a string"

    var p5 : Int = 19


    //由于scala源代码是面向行的，所以你可以这样写

    // begin
    var p6 =

      6

    // end

    //赋值操作
    p2 = p3 ;

    //元组，这个是从python学的
    var tuple = (1,2)
    // print
    println( p2)
  }

}
