object FunctionDemo {

  def main(args: Array[String]): Unit = {
    delayed(time(90))
  }

  //定义传值函数：值的计算在函数体外完成
  def time(a:Int):Long={
    println(a)
    return System.nanoTime()
  }

  //定义传名函数：值的计算在函数体内完成,该函数在定义的时候 t: 前后必须要有空格
  def delayed( t: =>Long)={//表示该t为一个函数，其返回值的类型为Long
    println("在delayed函数内")
    println("参数:"+t)
    t
  }

  //可变参数
  def printStrings(args:String*): Unit ={
    for(s<-args){
      println(s)
    }
  }

  //闭包，匿名函数中，其函数体中引用了外部的变量
  def closures()={
    var factor=3;

    var multiplier=(i:Int)=>i*factor//其结果值的计算引用了外部的变量
  }

  //默认值函数
  def add(a:Int=5,b:Int):Int={
    return a+b
  }
}
