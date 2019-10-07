package challenge

class Challenge3 {

  /**
    * カリー化(currying)では引数２つの関数fがfを部分的に適用する引数１つの関数に変換されます。
    * この実装を記述してください。
    *
    * @param f A, Bの二つの型の引数を受け取り、Cの型の戻り値を返す関数
    * @return カリー化された関数f
    */
  def curry[A, B, C](f: (A, B) => C): A => B => C = ???


  /**
    * curryによる変換を逆向きに行うuncurryを実装してください。
    *
    * @param f A => B => Cの関数のチェイン
    * @return A, Bの二つの型の引数を受け取り、Cの型の戻り値を返す関数
    */
  def uncurry[A, B, C](f: A => B => C): (A, B) => C = ???


  /**
    * ２つの関数を合成する高階関数を実装してください。
    *
    * @param f Bの型の引数を受け取り、Cの型の値を返す関数
    * @param g Aの型の引数を受け取り、Bの型の値を返す関数
    * @return Aの型の引数を受け取り、Cの型の値を返す関数
    */
  def composite[A, B, C](f: B => C, g: A => B): A => C = ???
}
