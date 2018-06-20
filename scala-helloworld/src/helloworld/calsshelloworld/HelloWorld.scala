package helloworld.calsshelloworld

class HelloWorld {





  def main(args: Array[String]): Unit = {
    print("hello world")
  }


  def service(i: Int, f: Float): Unit = {
    println("i " + i)
    print("f " + f)
  }


  /**
    * 叫做伴生对象，相当于原java中的static初始化操作
    */
  object HelloWorld{

  }


}

