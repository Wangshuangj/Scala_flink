package demo1

class FxStyle {
  def printArgs(args:Array[String]):Unit={
    var i=0
    while (i < args.length){
      println(args(i))
      i+=1
    }
  }

  //函数式编程简化1
  def printArgs1(args:Array[String]):Unit={
    for (arg<-args){
      println(arg+"--method1")
    }
  }

  def test(a:Array[Int]):Unit={
    for (i<-a){
      println(i)
    }
  }

  //函数式编程简化2
  def printArgs2(arg:Array[String]):Unit={
    arg.foreach(println)
  }

}
