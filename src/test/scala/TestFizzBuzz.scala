import org.scalatest.FunSuite

import FizzBuzz._

class TestFizzBuzz extends FunSuite {

  test("Should say the current number") {
    assert("2" == sayNumber(2))
  }

  test("Should say 'Fizz' when number is divisible by 3") {
    assert("Fizz" == sayNumber(6))
  }

  test("Should say 'Buzz' when number is divisible by 5") {
    assert("Buzz" == sayNumber(10))
  }

  test("Should say 'FizzBuzz' when number is divisible both by 3 and 5") {
    assert("FizzBuzz" == sayNumber(75))
  }

  test("Should say 'Fizz' if the number contains 3") {
    assert("Fizz" == sayNumber(13))
  }

  test("Should say 'Buzz' if the number contains 5") {
    assert("Buzz" == sayNumber(52))
  }

  test("Should say 'FizzBuzz' if the number contains 3 and 5") {
    assert("FizzBuzz" == sayNumber(353))
  }

}
