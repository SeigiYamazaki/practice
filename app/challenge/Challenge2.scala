package challenge

class Challenge2 {

  /**
    * 指定された比較関数に従ってArray[A]がソートされているかどうか調べる関数isSortedを実装してください。
    * 比較関数の引数には、Array[A]の先頭から順に、その要素と次の要素が入ります。
    *
    * 例)
    *  target = Array(1,2,3,4,5,6)
    *  chk = (a: Int, b: Int) => a <= b
    *   の時、
    *  chk(1, 2) = true,
    *  chk(2, 3) = true, ...
    *   と繰り返し、全てtrueになるので、最終的な戻り値もtrue
    *
    * @param target ソートされているかを確認する対象の配列
    * @param chk 比較関数
    * @return ソートされている: true, ソートされていない: false
    */
  def isSorted[A](target: Array[A], chk: (A, A) => Boolean): Boolean = {
    if(target.length  < 2) return true
    @annotation.tailrec
    def loop(n:Int, m:Int):Boolean = {
      if(m == target.length) true
      else {
        if(chk(target(n), target(m)))
          loop(m, m+1)
        else return false
      }
    }

    loop(0, 1)
  }
}
