package Demo2
//类和对象2
object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")

  }
}

//Scala 为 Singleton 对象的 main 定义了一个 App trait 类型
object HelloWorld1 extends App{
  println("Hello, world!")
}
