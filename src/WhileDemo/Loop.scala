package WhileDemo

object Loop extends App {

  class Loop{
  //最大公因数的实现
  def gcdLoop(x:Long,y:Long):Long={
    var a = x
    var b = y
    while (a!=0){
      var temp = a
      a = a % b
      b = temp
    }
    b

  }

  def gcdLoop1(): Unit ={
    //while循环另外的一种的实现写法
    var  text = ""
    do{
      var text = readLine()
      println(text+"xxxxx")
    }while(text!="")
  }
}



  var  loop = new Loop()
  loop.gcdLoop1()

  var m = loop.gcdLoop(10,5)
  println(m)

  //var array = new Array[Int](10);
  // array1 = Array(1,3,4,5,6);

}
