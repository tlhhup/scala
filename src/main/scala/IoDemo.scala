import java.io.{File, FileNotFoundException, PrintWriter, Writer}

import scala.io.Source

object IoDemo {

  def main(args: Array[String]): Unit = {
    write

    Thread.sleep(10)

    read
  }

  private def read = {
    try {
      Source.fromFile("1.txt", "UTF-8").foreach(s => {
        println(s)
      })
    } catch {
      case e: FileNotFoundException => e.printStackTrace()
    }
  }

  def write={
    var writer=new PrintWriter(new File("1.txt"))
    writer.write("hello")

    writer.close()
  }

}
