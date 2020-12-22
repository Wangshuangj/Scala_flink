class Symbol {
  //符号1：=>
    var add = (x:Int) => x+1

  var xxx = (x:String) => println("cccc"+x)

  //符号2:->
  def ss():Unit={
    var a = Array(434,55,6,8)
    //数组遍历1
    for (i <- a.indices){
      println(a.apply(i))
    }

    //数组遍历2
    for (i <- a){
      println(i)
    }

    var b = (1,"c","cc")
    for (i <- 0 until  b.productArity){
      var e = b.productElement(i)
      println(e)
    }

  }

  //++=（字符串拼接）
  def sub():Unit={
    var a = "aaa"
    a += "b"
    println(a)
    a += "c"
    println(a)
  }

}
