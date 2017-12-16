import scala.util.control.Breaks

object HelloWorld {

  //scala可以理解为对象的集合
  def main(args: Array[String]): Unit = {  //Unit为数据类型，类似void

    //定义变量  var 变量名:数据类型＝init value
    var i:Int=60   //变量声明必须赋值     ，指定了数据的类型
    var a =90      //根据赋值来确定数据的类型

    println(i)

    //定义常量
    val constant="hehe"
    println(constant)

    //流程控制
    //if
    if(i>70){
      print(i)
    }else{
      println("值不大于"+i)
    }

    // loop
    val loop=new Breaks   //在Scala中没有continue和break   只能通过该对象来控制循环跳出
    loop.breakable{
      while(true){
        i+=1
        print(i)
        if(i>70){
          println("跳出循环")
          loop.break()//跳出当前的loop语句块
        }
      }
    }

    //for (var x <- Range)   Range 可以是一个数字区间表示 i to j ，或者 i until j。左箭头 <- 用于为变量 x 赋值。
    var x=0;
    for(x <- 1 to 5){
      print(x)
    }

    a = 0;
    var b = 0;
    // for 循环
    for( a <- 1 to 3; b <- 1 to 4){ //多个区间，执行次数由大的决定,多个区间采用";"隔开
      println( "Value of a: " + a );
      println( "Value of b: " + b );
    }

    //循环过滤
    a = 0;
    val numList = List(1,2,3,4,5,6,7,8,9,10);

    // for 循环
    for( a <- numList if a != 3; if a < 8 ){
      println( "Value of a: " + a );
    }

  }

}
