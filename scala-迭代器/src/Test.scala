object Test {

  def main(args: Array[String]): Unit = {
    val iterator = Iterator("www.baidu.com" , "Runoob" ,  "Taobao")

    while(iterator.hasNext){
      println(iterator.next())

    }
  }

}
