//if文を試す
public class Main {
  public static void main(String[] args){
      int score = 90;  //変数scoreに90を入れる
      if (score >= 80) {
          System.out.println("やったね！次もこの調子だ");
          //int~調子だ"）;までもしも点数が80点以上なら設定した文字列が表示される。
          //80点未満の時は何も表示されない
      }
  }
}
//そうでない時 else
public class Main {
  public static void main(String[] args) {
      int score = 60;  //変数scoreに60を入れる
      if (score >= 80) {
          System.out.println("やったね！次もこの調子だ");
      } else {
          System.out.println("残念でした");
          //if~でした"まで、もしも点数が80点以上なた「やったね！」の文字列が表示され、
          //80点未満の時は、「残念でした」の文字列が表示される
      }
  }
}
//くじ引きプログラムを作る
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();  //ランダムな数を出す部分
        int score = rnd.nextInt(100);  //100までのランダムな数
        if (score >= 90) {  //90以上なら当たり
            System.out.println("当たり！");
        } else {
            System.out.println("ハズレ");
        }
    }
}