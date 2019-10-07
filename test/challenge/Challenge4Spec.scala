package challenge

import org.scalatest.WordSpec

class Challenge4Spec extends WordSpec{

  val challenge = new Challenge4

  "challenge4" should {
    "文字列 line と、文字列を分割する桁数のリスト eachLengths を受け取り、分割した文字列リストを返す関数を実装してください。" in {
      val result1 = challenge.splitString("abc def ghi jk lmn ", Seq(4, 4, 4, 3, 4))
      assert(result1.head == "abc ")
      assert(result1(1) == "def ")
      assert(result1(2) == "ghi ")
      assert(result1(3) == "jk ")
      assert(result1(4) == "lmn ")

      val result2 = challenge.splitString("123456789098765", Seq(1, 2, 3, 4, 5))
      assert(result2.head == "1")
      assert(result2(1) == "23")
      assert(result2(2) == "456")
      assert(result2(3) == "7890")
      assert(result2(4) == "98765")
    }

    "文字列 line をReportクラスのフィールド定義にしたがって分割し、Reportクラスのインスタンスを作成してください。" in {
      val result = challenge.createReport("A1FMS00100523     20190830  201908300001        ﾐｽﾞｺｼ ﾌｻｺ           E")
      assert(result.recordKind == "A1")
      assert(result.centerCode == "FMS001")
      assert(result.requestKey == "00523     ")
      assert(result.orderDate == "20190830  ")
      assert(result.inspectionKey == "201908300001        ")
      assert(result.patientName == "ﾐｽﾞｺｼ ﾌｻｺ           ")
      assert(result.statusFlg == "E")
    }
  }
}
