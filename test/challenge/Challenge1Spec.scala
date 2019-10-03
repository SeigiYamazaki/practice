package challenge

import org.scalatest.WordSpec

class Challenge1Spec extends WordSpec {

  val challenge = new Challenge1

  "challenge1" should {
    "フィボナッチ数列からn番目の数を取得する再帰関数を記述してください。" in {
      assert(challenge.fib(0) == 0)
      assert(challenge.fib(1) == 1)
      assert(challenge.fib(3) == 2)
      assert(challenge.fib(4) == 3)
      assert(challenge.fib(7) == 13)
      assert(challenge.fib(46) == 1836311903)
    }
  }
}
