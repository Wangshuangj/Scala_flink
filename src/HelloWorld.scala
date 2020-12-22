object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("hello,world !!!")
    sayhello()

    var x =  max(5,4)
    println(x)

    var Scala_sz = new Scala_sz()
    Scala_sz.shuzu()
    Scala_sz.bianli()
    Scala_sz.update()
    Scala_sz.testlist()
    Scala_sz.tuple()
    Scala_sz.setmap()


  }

  def max(x: Int, y: Int): Int = {
    if (x > y) x*y
    else
      y
  }

  //返回值为Unit
  def sayhello(): Unit={
    println("SayHello !")
  }

}

