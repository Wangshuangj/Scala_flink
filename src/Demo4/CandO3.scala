package Demo4

//类和对象（三）
//有理数对象
object CandO3 extends App {

  //有理数的定义：一个有理数(rational)可以表示成个分数形式： n/d, 其中 n 和 d 都是整数（d 不可以为 0），n 称为分子(numberator)，d 为分母(denominator)。
  //immutable对象是不可直接赋值的对象，它可以有效的避免错误赋值的问题
  //Scala 的类定义可以有参数，称为类参数
  //Scala 使用类参数，并把类定义和主构造函数合并在一起，在定义类的同时也定义了类的主构造函数。因此 Scala 的类定义相对要简洁些。
  class Rational(n:Int,d:Int){
    println("Create "+n+"/"+d)

  }

  new Rational(1,2)   //Create 1/2
  //说明上述在创建 Ratiaonal 对象时,自动执行类定义的代码（主构造函数）。

  println(new Rational(1,2))  //打印对象，缺省使用tostring()方法，结果为【对象的类名称+“@”+16 进制数（对象的地址）】

  //手动修改tostring方法
  //可以使用 override 来重载基类定义的方法，而且必须使用 override 关键字表示重新定义基类中的成员
  class Rational1(n:Int,d:Int){
    override def toString: String = n+"/"+d
  }
  println(new Rational1(4,8))

  //当分母为0时
  println(new Rational1(1,0))
  //解决方法,添加require(d!=0)
  class Rational2(n:Int,d:Int){
    require(d!=0)
    override def toString: String = n+"/"+d
  }

  //println(new Rational2(1,0))  //Exception in thread "main" java.lang.IllegalArgumentException: requirement failed
  println(new Rational2(3,5))
  println(new Rational2(3,6))  // 3/6


}
