class Scala_sz {
  def shuzu(): Unit={
    val arr1 = new Array[String](3)
    //注意Scala数组使用的圆括号()
    arr1(0) = "你是沙雕"
    arr1(1) = "xxxxxxxxxx"
    arr1(2) = "abc"
    //arr1(3) = "mmm"

    println(arr1.apply(2))

  }

  def bianli():Unit={
    val arr2 = new Array[String](3)
    //注意Scala数组使用的圆括号()
    arr2(0) = "你是沙雕"
    arr2(1) = "xxxxxxxxxx"
    arr2(2) = "abc"
    for (i <- 0 to 2){
      println(arr2.apply(i))

    }

  }
  def update():Unit={
    val a = Array("a","b","c","d")
    a.update(1,"eee")
    println(a.apply(1))
    for (i <- 0 to 3){
    println(a.apply(i))
    }
  }


  //使用List
  def testlist():Unit= {
    val one = List(1,2)
    val two = List(3,4)
    val three  = one ::: two
    println(three)


    //::操作符,也是::方法，调用时使用.::()
    val  four = three. ::(5).::(6)
    println(four)


    //调用空列表对象
    val nil = Nil.::(1).::(2).::(3)
    println(nil)   //List(3, 2, 1)

  }


  //元组（ Tuples )
  //Tuples​ 可以包含不同类型的数据
  //Tuples 在方法需要返回多个结果时非常有用
  def tuple():Unit={

    //一但定义了一个元组，可以使用 ​._​和索引来访问员组的元素（矢量的分量，注意和数组不同的是，元组的索引从 1 开始）。
    val t1 = (99,"这是string类型数据",Array(1,2,3))
    println(t1._1)
    println(t1._2)
    println(t1._3.apply(1))
    println("--------------------------------------")
    println(t1.productArity)  //获取tuple长度
    //遍历tuple
    //方法1
    for (i <- 0 until t1.productArity){
      val element = t1.productElement(i)
      println(element)

    }

    println("----------------------------------------")
    //方法2
    t1.productIterator.foreach{
      i => println(i)

    }


  }

  //Set和Map
  def setmap():Unit={

    //set
    var jetSet = Set("hello","world")
    jetSet+="hi"
    println(jetSet)
    //判断是否包含
    println(jetSet.contains("hello"))

    //遍历
    jetSet.foreach(i=>println(i))

    //map
    var map = Map(1->"aaa",2->"bbb",3->"ccc",4->"ddd")
    println(map(2))


  }

}
