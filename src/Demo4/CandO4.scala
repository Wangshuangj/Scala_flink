package Demo4

////类和对象（四）
object CandO4 extends App {
  println(new Rational4(2,5))

  class Rational4(n:Int,d:Int){
    require(d!=0)
    override def toString: String = n+"/"+d


  }


  //两个 Rational 对象相加的操作
  class Rational5(n:Int,d:Int){
    require(d!=0)
    val numberator = n
    val denominator = d
    override def toString: String = n+"/"+d
    def add(that:Rational5)=new Rational5(
      numberator*that.denominator+that.numberator*denominator,
      denominator*that.denominator
    )

    //自身引用
    def lessThan(that:Rational5)=
      this.numberator*that.denominator < that.numberator*this.denominator

    def xx(that:Rational5):Unit={
      println(this.numberator+"---a")   //2---a
      println(that.numberator+"---b")   //5---b
    }


    def max(that:Rational5)=
      if (lessThan(that))
        that
      else this   //此处调用自身，this不能省略

  }

  println(new Rational5(66,42)+"555555555555555555")
  println(new Rational5(4,5).max(new Rational5(1,3)))
  println(new Rational5(2,3).xx(new Rational5(5,6)))
  println(new Rational5(2,3).lessThan(new Rational5(5,6)))



  val oneHalf=new Rational5(1,2)
  println(oneHalf)

  val twoThrids = new Rational5(2,3)
  println(twoThrids)

  println(oneHalf add twoThrids)
  println(oneHalf.add(twoThrids))

  println(oneHalf.numberator)



  class  Rational6 (n:Int, d:Int) {
       require(d!=0)
    //实现化简
       private val g =gcd (n.abs,d.abs)
       val number =n/g
       val denom =d/g
       override def toString = number + "/" +denom
       def add(that:Rational6)  =
          new Rational6(
            number * that.denom + that.number* denom,
           denom * that.denom
         )
    //构造函数
    def this(n:Int) = this(n,1)
    //求分子和分母的最大公倍数的私有方法 gcd
    //注意 gcd 的定义，因为它是个回溯函数，必须定义返回值类型。
    private def gcd(a:Int,b:Int):Int =
      if(b==0) a else gcd(b, a % b)
    }

  println(new Rational6(66,42))






}
