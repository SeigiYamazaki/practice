package challenge

class Challenge4 {

  /**
    * 文字列 line と、文字列を分割する桁数のリスト eachLengths を受け取り、分割した文字列リストを返す関数を実装してください。
    *
    * 例)
    *  line = ”abc def ghijk”
    *  eachLengths = Seq(4, 4, 2, 3)
    *   の時、4桁, 4桁, 2桁, 3桁の順で文字列を分割するので、
    *  Seq("abc ", "def ", "gh", "ijk")
    *   が戻り値となる。
    *
    * @param line 分割対象の文字列
    * @param eachLengths 文字列を分割する桁数のリスト
    * @return 分割した文字列リスト
    */
  def splitString(line: String, eachLengths: Seq[Int]): Seq[String] = {

    def sum(n: Int): Int = {
      if(n == 0) 0
      else sum(n-1) + eachLengths(n-1)
    }

    for(i <- 0 until eachLengths.size) yield {
      //println(i)
      //println(sum(i))
      val x = sum(i)
      line.substring(x, x+eachLengths(i))
    }

  }

  /**
    * 文字列 line に、次のような電文が渡されます。
    *  "A1FMS00100523     20190830  201908300001        ﾐｽﾞｺｼ ﾌｻｺ           E"
    *
    * これをReportクラスのフィールド定義にしたがって分割し、Reportクラスのインスタンスを作成してください。
    * 以下がReportクラスのフィールド定義です。
    *
    *    項目名　　　　　　文字数　　例
    * 1. レコード区分　　　2 　　　　"A1"
    * 2. センターコード　　6 　　　　"FMS001"
    * 3. 依頼元キー　　　　10　　　　"00523     "
    * 4. 依頼日　　　　　　10　　　　"20190830  "
    * 5. 検査キー　　　　　20　　　　"201908300001        "
    * 6. 患者名　　　　　　20　　　　"ﾐｽﾞｺｼ ﾌｻｺ            "
    * 7. 状態フラグ　　　　1 　　　　"E"
    *
    * @param line 分割対象の文字列
    * @return Reportクラスのインスタンス
    */
  def createReport(line: String): Report = {
    val x = splitString(line, Seq(2, 6, 10, 10, 20, 20, 1))
    //println(x(0))
    Report(x(0), x(1),  x(2), x(3), x(4), x(5), x(6))

  }

  case class Report
  (
    recordKind: String, // レコード区分
    centerCode: String, // センターコード
    requestKey: String, // 依頼元キー
    orderDate: String, // 依頼日
    inspectionKey: String, // 検査キー
    patientName: String, // 患者名
    statusFlg: String // 状態フラグ
  ){
    assert(recordKind.length == 2)
    assert(centerCode.length == 6)
    assert(requestKey.length == 10)
    assert(orderDate.length == 10)
    assert(inspectionKey.length == 20)
    assert(patientName.length == 20)
    assert(statusFlg.length == 1)
  }
}
