class Singleton private(val color:String){
  override def toString: String = return this.color
}

//伴生对象
object Singleton{

  private val markers: Map[String, Singleton] = Map(
    "red" -> new Singleton("red"),
    "blue" -> new Singleton("blue"),
    "green" -> new Singleton("green")
  )

  def apply(color:String) = {
    if(markers.contains(color)) markers(color) else null
  }


  def getMarker(color:String) = {
    if(markers.contains(color)) markers(color) else null
  }

  def main(args: Array[String]): Unit = {
    println(Singleton("red"))

    println(Singleton.getMarker("red"))
  }

}
