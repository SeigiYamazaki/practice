package question

import org.scalatest.WordSpec

class Question1Spec extends WordSpec {

  val question: Question1 = new Question1

  "Question1" should {
    "q1_1: 二つの正整数 x, y を引数とし、x と y の積が偶数の場合はEven,奇数の場合はOddを返してください。" in {
      assert(question.q1_1(1, 3) == "Odd")
      assert(question.q1_1(19, 31) == "Odd")
      assert(question.q1_1(2, 7) == "Even")
      assert(question.q1_1(22, 46) == "Even")
    }
  }
}
