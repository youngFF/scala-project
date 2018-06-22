object Test {

  def main(args: Array[String]): Unit = {
    //创建一个大小为3的数组
    var z:Array[String] = new Array[String](3)
    //或者这样创建，省略类型
    var z1 = new Array[String](3) ;

    //当然也可以使用如下方式创建数组
    var z2 = Array("Runnob" , "baidu" , "Google")


    for(x <- 0 to z.length-1){
      println(z2(x))
    }


    //合并数组
    var z3 = Array.concat(z2, z1)



    //创建区间数组，和matlab差不多 , range(start , end , step )
    var z4 = Array.range(10 , 20, 2)


  }

}
