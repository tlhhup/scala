import Array._//导入所有的成员

object ArrayDemo {

  def main(args: Array[String]): Unit = {
    var array1:Array[Int]=Array(1,2,3)

    var array2:Array[String]=new Array[String](3)

    var array3=ofDim[Int](2,3)//定义多维数组

    var array4=range(1,10)
    var array5=range(1,10,2)
  }

}
