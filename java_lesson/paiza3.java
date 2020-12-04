//メソッド（関数）で命令をまとめる
public class Main {
  public static void main(String[] args) {
      sayhello();  //挨拶を表示するメソッドの呼び出し
      sayhello();  //     同上
      sayhello();  //     同上
  }
  static void sayhello() {
      System.out.println("こんにちは");  //作成をした挨拶を表示するメソッド
  }
}
//単純なメソッド 引数がある時
public class Main {
  public static void main(String[] args) {
      sayhello2("いろは");  //挨拶を表示するメソッドを呼び出し
      sayhello2("オオカミ先生");
  }
  static void sayhello2(String name) { //作成した名前付きで挨拶を表示するメソッド
  System.out.println("こんにちは、" + name + "さん");
  }
}
//static 戻り値の型 メソッド名（） {
  //メソッドで行う処理
  //return 戻り値;
//}
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int d = dice();  //メソッドを呼び出してサイコロの目を変数に入れる
        System.out.println("サイコロは、"+d);  //結果を表示
    }
    static int dice() {
        Random rnd = new Random();
        int ans = rnd.nextInt(6);
        return ans;  //static〜ans;まで、作成したサイコロの目を返すメソッド
    }
}
//static 戻り値の型 メソッド名（引数１の型 引数１ 引数２の型 引数２,..）{
  //メソッドで行う処理
  //return 戻り値;
//}
//消費税計算のプログラム
public class Main {
  public static void main(String[] args) {
      double ans = postTaxPrice(980);  //金額を渡して消費税計算の結果を変数に入れる
      System.out.println(ans + "円");  //結果を表示
  }
  static double postTaxPrice(int price) {
      double ans = price * 1.08;
      return ans; 
       //static~ans;まで、渡された金額で消費税を計算して返すメソッド
  }
}
//計算問題大量作成マシーンのプログラム
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        for (int i =  0; i < 5; i++) {
            makeQuestion();  //計算問題を表示するメソッドを繰り返し呼び出す
        }
    }
     static void makeQuestion() {
        Random rnd = new Random();
        int a = rnd.nextInt(100);
        int b = rnd.nextInt(100);
        String quedtion = a + "x" + b + "=?";
        System.out.println(quedtion);
        //計算問題を表示するメソッド
    }
}
//おみくじメソッドをランダムに作る
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        omikuji();  //おみくじメソッドを呼び出す
    }
    static void omikuji() {  //おみくじメソッド
        String [] kuji = {"大吉","中吉","吉","末吉","凶"};
        Random rnd = new Random();
        int id = rnd.nextInt(kuji.length);
        System.out.println(kuji[id]);
    }
}
//現在時刻を表示するプログラム
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now(ZoneId.
    of("Asia/Tokyo"));  //現在の時刻を変数nowに入れる
        String nowTime = now.getHour() + ":" + now.
    getMinute() + ":" + now.getSecond();  //時分秒を取得し、つなげた文字列にする
        System.out.println(nowTime);
    }
}

public class Main {
  public static void main(String[] args) {
      MyClass myclass = new MyClass();
      // MyClass(クラス名)  myclass(変数名)  new MyClass();(インスタンスを作る命令)
      
      System.out.println("XXXXXXXX");
  }
}

