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
//for（カウント変数の初期化; くり返す条件式; カウント変数の変化式) {
    //くり返す処理
}
public class Main {
  public static void main(String[] args) {
      for(int i = o; i <= 9; i++) {  //変数ｉは0から9まで1を足していく
      System.out.println("5 x " + i + " = " + (5 * i));
      //変数iを含めたかけ算式。５x０〜５x９の10個のかけ算をする
  }
}