public class Sample {

  public static void main(String[] args) {
    //多次元配列の宣言
    String[][] testScore = {
      { "国語", "80" }
      , { "算数", "90" }
      , { "社会", "70" }
      , { "理科", "75" }
      , { "体育", "75" }
    };

    System.out.println("教科:" + testScore[1][0] + "、点数:" + testScore[1][1]);
  }

}