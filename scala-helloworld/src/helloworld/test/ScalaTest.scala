package helloworld.test

import helloworld.calsshelloworld.HelloWorld
import java.awt._



object ScalaTest {



  def main(args  : Array[String]) : Unit ={
    new HelloWorld().service(3,4F) // don't need to add coma
  }


  def handler(event : event.ActionEvent) : Unit = {
    println(event.setSource())
  }
}



