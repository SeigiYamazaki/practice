package challenge

import org.scalatest.WordSpec

class Challenge2Spec extends WordSpec{

  val challenge = new Challenge2

  "challenge2" should {
    "指定された比較関数に従ってArray[A]がソートされているかどうか調べる関数isSortedを実装してください。" in {

      assert(challenge.isSorted(Array(), (a: Int, b: Int) => a <= b))
      assert(challenge.isSorted(Array(1), (a: Int, b: Int) => a <= b))
      assert(challenge.isSorted(Array(1,2), (a: Int, b: Int) => a <= b))

      assert(challenge.isSorted(Array(1,2,3,4,5,6), (a: Int, b: Int) => a <= b))
      assert(challenge.isSorted(Array(6,5,4,3,2,1), (a: Int, b: Int) => a >= b))
      assert(! challenge.isSorted(Array(1,2,3,4,3,2), (a: Int, b: Int) => a <= b))

      assert(challenge.isSorted(Array("a", "b", "c", "d"), (a: String, b: String) => a <= b))
      assert(challenge.isSorted(Array("z", "y", "x", "w"), (a: String, b: String) => a >= b))
      assert(! challenge.isSorted(Array("a", "b", "c", "d"), (a: String, b: String) => a >= b))
    }
  }
}
