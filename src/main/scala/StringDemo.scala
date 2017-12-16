object StringDemo {

  def main(args: Array[String]): Unit = {
    var str="hello,world"//字符串不可变

    var builder=new StringBuilder;
    builder.append("hello")

    println(builder.toString().length)
  }

}
