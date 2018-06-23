package scala单例对象


//私有构造方法
class Marker private(val color:String) {

  println("创建" +this)


  //注意：这个很奇怪，不需要使用return
  override def toString(): String = "颜色标记： " + color ;

}


// 创建伴生对象，与类共享名字，可以访问类的私有属性和方法

object Marker{

  private val markers:Map[String , Marker] = Map(
    "red" -> new Marker("read"),
    "blue" -> new Marker("blue"),
    "green" -> new Marker("green")
  )







}