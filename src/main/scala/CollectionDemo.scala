object CollectionDemo {

  def main(args: Array[String]): Unit = {

  }

  def listDemo()={
    //其值不能更改
    var a:List[Int]=List(1,2,3)
    var b:List[Int]=List(2,3,4)
    //concat
    var c=a:::b
    var d=List.concat(a,b)
    println(c)
    //repeat
    var e=List.fill(2)(3);
  }

  def setDemo()={
    var a=Set(1,3)
    var b=Set(2,4)

    println(a.min)
    println(a.max)

    //concat
    var c=a++b
    c=a.++(b)

    c=a.&(b)
  }

  def mapDemo()={
    var a:Map[Char,Int]=Map('a'->1,'b'->2)
    var b:Map[Char,Int]=Map('a'->1,'b'->2)

    //concat
    var c=  a.++:(b)

    var keys=c.keys
    for(key<-keys){
      println(key)
      println(c.get(key))
    }
  }

  def tupleDemo()={//元祖  其值也是不能改变的  ,可以存储不同的数据类型的集合
    var a=(1,2,3)
    var b=Tuple2(1,1.2)  //最后的数组表示的是该元祖中存在数据的最大值,目前最大值为22

    // get
    println(b._1)

    //iterator
    b.productIterator.foreach(i=>print(i)) //语法类似java中的lambda表达式
  }


}
