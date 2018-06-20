import scala.util.control.Breaks


object Test {

  // 创建main方法
  def main(args: Array[String]): Unit = {
    var a = 0;
    val numList = List(1,2,3,5,6,4,65);
    val loop = new Breaks

    loop.breakable {
      for (a <- numList) {
        print(a)
        if (a == 4) {
          loop.break();
        }


      }
    }

  }
}
