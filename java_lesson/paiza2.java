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
//ランダムに出す、九九の段
import java.util.Random;
public class Main {
    public static void main(String[] args) {
       Random rnd = new Random();  //ランダムな数を出す部品
       int answer = rnd.nextInt(10);  //かける数
       String question = "";  //問題文変数
       for(int i = 0; i <= 9; i++) {
           //問題文変数に、[ answer*i ]を足していきます
           question = question + "[" + (answer * i) + "]";
       }
       System.out.println("何の段の九九でしょう？");
       System.out.println(question);
       System.out.println("答え:"+answer);
    }
}
//for (配列の型 要素を入れる変数名: 配列) {
  //繰り返す処理
}
//配列の全ての要素について繰り返す拡張for文
public class Main {
  public static void main(String[] args) {
      int [] scorelist= {64, 100, 78, 80, 72};
      for(int i:scorelist) {  //配列の全ての要素について表示する事を繰り返す
      System.out.println(i);
      }
  }
}