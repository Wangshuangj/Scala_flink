//Scala的函数式编程风格
object Style {
  def main(args: Array[String]): Unit = {
    printArgs(Array(1,434,5,6,8,12))

  }

  //传统的写法
  def printArgs(args: Array[Int]): Unit ={
    var i = 0
    while (i < args.length){
      println(args(i))
      i+=4
    }

  }


  //函数式
  def printArgs2(args:Array[Int]): Unit = {
    for (arg <- args)
      println(args)
  }
}
