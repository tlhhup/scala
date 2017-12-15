object HelloWorld {

  //scala可以理解为对象的集合
  def main(args: Array[String]): Unit = {  //Unit为数据类型，类似void

    //定义变量  var 变量名:数据类型＝init value
    var i:Int=90   //变量声明必须赋值     ，指定了数据的类型
    var a =90      //根据赋值来确定数据的类型

    println(i)

    //定义常量
    val constant="hehe"
    println(constant)
  }

}
