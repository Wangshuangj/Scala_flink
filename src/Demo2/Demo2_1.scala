package Demo2
//类和对象1
object Demo2_1 {


  def main(args: Array[String]): Unit = {
    var checksumAccumulator = new ChecksumAccumulator();
    var a = checksumAccumulator.add(4);
    var b = checksumAccumulator.checkSum();
    //println(a)
    //println(b)

    println(ChecksumAccumulator.calculate("Welcome to Scala Chinese community"))

  }

  //创建一个计算整数累计校验和的类
  class ChecksumAccumulator{
    private var sum = 0;
    def add(b:Byte):Unit = sum += b
    def checkSum():Int = ~(sum & 0xFF) +1

  }

  //创建ChecksumAccumulator类的“伴侣”对象
  object ChecksumAccumulator{
    private var cache = Map[String, Int]()
    def calculate(s:String):Int={
      if (cache.contains(s)){
        cache(s)
      }else{
        val acc = new ChecksumAccumulator()
        for (c<-s){
          acc.add(c.toByte)
        }
        val cs = acc.checkSum()
        cache += (s -> cs)
        cs
      }
    }

  }



  //注意： Scala的方法的参数都是val类型,而不是var类型,因此在函数体内不可以修改参数的值

}
