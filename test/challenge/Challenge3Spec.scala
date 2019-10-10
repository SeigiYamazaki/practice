package challenge

import org.scalatest.WordSpec

class Challenge3Spec extends WordSpec {

  val challenge = new Challenge3

  class A()
  class B()
  class C()

  "challenge3" should {
    "カリー化(currying)では引数２つの関数fがfを部分的に適用する引数１つの関数に変換されます。この実装を記述してください。" in {
      val f = challenge.curry((_: A, _: B) => new C())
      val result = f match {
        case _: (A => B => C) => true
        case _ => false
      }

      assert(result)
    }

    "curryによる変換を逆向きに行うuncurryを実装してください。" in {
      val f = challenge.uncurry((_: A) => (_: B) => new C())
      val result = f match {
        case _: ((A, B) => C) => true
        case _ => false
      }

      assert(result)
    }
//
    "２つの関数を合成する高階関数を実装してください。" in {
      val f = challenge.composite((_: B) => new C, (_: A) => new B)
      val result = f match {
        case _: (A => C) => true
        case _ => false
      }

      assert(result)
    }
  }
}
