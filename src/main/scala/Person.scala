abstract class Person(xa: Int, xb: Int) {
  //define a class  this is a constructor

  var a: Int = xa
  var b: Int = xb

  def move(dx: Int, dy: Int) = {
    //该方法为没有返回值

  }

  def add(x: Int, y: Int): Int //abstract method

}

class Zhangsan(xa: Int, xb: Int) extends Person(xa, xb) {
  override def add(x: Int, y: Int): Int = return a + b
}


