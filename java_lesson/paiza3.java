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
