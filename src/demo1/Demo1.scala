package demo1

object Demo1 {
  def main(args: Array[String]): Unit = {
    var FxStyle = new FxStyle();
    FxStyle.printArgs(Array("a","b","c","d"));
    FxStyle.printArgs1(Array("a","b","c","d"));
    FxStyle.test(Array(1,2,3,4,5,6));
    FxStyle.printArgs2(Array("a","b","c","d"));


    var File = new File()
    File.inputFile(Array("f","v","r"))

  }



}
