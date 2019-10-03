package question

class Question1 {

  /**
    * 二つの正整数 x, y を引数とし、x と y の積が偶数の場合は"Even", 奇数の場合は"Odd"を返してください。
    *
    * 例)
    *  x = 2, y = 3 -> Even
    *  x = 5, y = 7 -> Odd
    *
    * @param x 正整数
    * @param y 正整数
    * @return 文字列 "Even" または "Odd"
    */
  def q1_1(x: Int, y: Int): String = {
    if(x * y % 2 == 0){
      "Even"
    } else {
      "Odd"
    }
  }
}
