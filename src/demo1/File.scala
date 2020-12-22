package demo1

import scala.io.Source

class File {

  //Scala 读写文件的基本方法。比如下面的例子读取文件的每行，把该行字符长度添加到行首：
  def inputFile(args:Array[String]):Unit={
    if (args.length > 0){

      for( line <- Source.fromFile("src/a.txt").getLines())
        println(line.length + " " + line)
    }
    else
      Console.err.println("Please enter filename")


  }

}
