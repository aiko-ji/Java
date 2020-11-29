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