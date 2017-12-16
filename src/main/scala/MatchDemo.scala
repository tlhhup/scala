object MatchDemo {//其类似java中的switch  case

  def main(args: Array[String]): Unit = {
    for(s<-Range(2,4)){
      s match {
        case 1 =>println("当前的值为1")
        case 2 =>println("当前的值为2")

        case _ => println("default")
      }
    }
  }

}
