package Demo3

object CaoZuoFu extends App {



  //算符（操作符）实际为普通类方法的简化,比如:1+2 ,实际为 (1).+(2)
  val sumMore = (1).+(2)
  println(sumMore)

  val s = "Hello,World"
  var n = s.indexOf("o")
  println(n)

  //将indexOf方法用运算符的方式书写
  var n1 = s indexOf "o"
  println(n1)




  //除了类似+的中缀运算符（操作符在两个操作符之间），还可以有前缀运算符和后缀运算符
  //前缀和后缀操作符都使用一个操作数，而中缀运算符使用前后两个操作数
  val a = -2.0
  println(a)
  val b = (2.0).unary_-
  println(b)

  //+,-,! 和～四个符号作为前缀操作符

  var c = s toLowerCase()
  println(c)


  def salt()={
    println("salt")
    false

  }
  def pepper()={
    println("pepper")
    true
  }

  println(pepper()) //true
  println(salt())  //false
  var t = pepper() && salt()
  println(t+"!!!!!!!!!!!!!!!!!!!!!!")
  var  t1 = salt() && pepper()
  println(t1+"!!!!!!!!!!!!!!!!!!!!!")

}
