package question

import org.scalatest.WordSpec

class Question2Spec extends WordSpec{

  val question: Question2 = new Question2

  "Question2" should {
    "整数nを受け取り、1からnまでの整数の合計を返す再帰関数を定義してください。" in {
      assert(question.sum(5) == (1 to 5).sum)
      assert(question.sum(10) == (1 to 10).sum)
      assert(question.sum(100) == (1 to 100).sum)
      assert(question.sum(1000) == (1 to 1000).sum)
    }
  }
}
