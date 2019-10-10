package question

class Question2 {

  /**
    * 整数nを受け取り、1からnまでの整数の合計を返す再帰関数を定義してください。
    *
    * 例)
    *  n = 5 の時、
    *  1 + 2 + 3 + 4 + 5 = 15
    *
    * @param n 整数 (0 < n)
    * @return 1からnまでの整数の合計
    */
  def sum(n: Int): Int = {
    if(n == 0)
      return n
    else
      sum(n-1) + n

  }
}

