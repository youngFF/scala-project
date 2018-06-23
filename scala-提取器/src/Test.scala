object  Test {

  def main(args: Array[String]): Unit = {
      println("Apply 方法 ： " + apply("Zara" , "gmail.com"))
      println("UpApply 方法 ： " + unapply("Zara@gail.com") )
      println("UpApply 方法 ： " + unapply("Zara ali") )
  }


  def apply(user:String , domain : String ): Unit ={
    user + "@" + domain
  }

  def unapply(arg: String): Option[(String , String )] ={
    val parts = arg.split("@")
    if (parts.length ==2)
      Some(parts(0) , parts(1))
    else
      None
  }


}
