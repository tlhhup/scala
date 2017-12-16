import java.io.{FileNotFoundException, FileReader, IOException} //导入指定的成员

object ExceptionDemo {

  def main(args: Array[String]): Unit = {
    //语法类似python中的异常处理

    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => {
        println("Missing file exception")
      }
      case ex: IOException => {
        println("IO Exception")
      }
    } finally {
      println("Exiting finally...")
    }
  }

}
