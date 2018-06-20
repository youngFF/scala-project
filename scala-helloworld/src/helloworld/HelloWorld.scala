package helloworld


/**
  * 创建一个对象，这个在java中还没有这个玩法。
  * 缺点：编译时间太长
  */
object HelloWorld {


  /**
    * 这个就是函数式编程 类似与普通变量定义： var variable = value
    * @param args
    */
  def main(args:Array[String]): Unit = {
    print("hell world") // print hello world
  }

  def sing(i:Int , f : Float): Unit ={
    print(i + " " + f)
  }





}
