trait Equal {


  // 抽象，没有方法体
  def isEqual(x : Any) : Boolean

//  def notEqual(x : Any) : Boolean  = ! isEqual(x)
  def notEqual(x : Any) : Boolean  = {
    ! isEqual(x)
    //也可以return !isEqual(x)

    //编译器把最后一条语句的返回值当做函数的返回值
    !isEqual(x)
  }

}
