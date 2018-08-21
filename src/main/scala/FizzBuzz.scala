object FizzBuzz extends App {

  def sayNumber(number: Int): String = {
    def saidNumber: String = number match {
      case _ if isFizzBuzz(number) => "FizzBuzz"
      case _ if isFizz(number) => "Fizz"
      case _ if isBuzz(number) => "Buzz"
      case _ => number.toString
    }
    saidNumber
  }

  private def isFizzBuzz(number: Int) = {
  number % 15 == 0 || (number.toString.contains("3") && number.toString.contains("5"))
  }

  private def isFizz(number: Int) = {
    number % 3 == 0 || number.toString.contains("3")
  }

  private def isBuzz(number: Int) = {
    number % 5 == 0 || number.toString.contains("5")
  }

  override def main(args: Array[String]): Unit = {
    (1 to 100).foreach((number: Int) => println(sayNumber(number)))
  }

}
