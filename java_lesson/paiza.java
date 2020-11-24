public class Main {
    public static void main(String[] args){
       System.out.println("こんにちは");
       System.out.println("いろはちゃん");
       System.out.println(10 + 5);
       System.out.println(10 - 5);
       System.out.println(10 * 5);
       System.out.println(10 / 2);
       System.out.println(10 / 4);
       System.out.println(10 / 4.0);
       System.out.println(10 % 4);
       System.out.println(10000 + 5000);
       System.out.println(10000.1 + 5000.1);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(true); //true=真・fales=偽
        int a;  //変数aの宣言
        a = 10; //変数aに10を入れる
        System.out.println(a); //変数aの値を表示
    }
}

public class Main {
    public static void main(String[] args) {
        int a = 10;  //変数aを宣言し、10を入れる
        int b = 20;  //変数bを宣言し、20を入れる
        System.out.println(a + b); //aとbを足した答えを表示
        int a = 10;  //10を入れた変数aを用意する
        a = a + 1;   //変数aに1を足す
        System.out.println(a);  //結果を表示
        a *= 2;  //変数aに2をかける
        System.out.println(a)  //結果を表示
    }
}

public class Main {
    public static void main(String[] args) {
        int a = 10;  //変数aを宣言し、10を入れる
        a++;  //インクリメント演算子で＋1をする
        System.out.println(a);  //結果を表示

    }
}

public class Main {
    public static void main(String[] args) {
        String name = "いろは";    //文字列を入れた変数name
        System.out.println(name);  //結果を表示

    }
}

public class Main {
    public static void main(String[] args) {
        String word1 = "こんにちは";   //文字列を入れた変数word1
        String word2 = "私はJavaを勉強中です。";  //文字列を入れた変数word2
        String word3 = word1 + word2;
        System.out.println(word3.length());  //結果を表示

    }
}
//文字列の一部を取り出す
public class Main {
    public static void main(String[] args) {
        String word = "こんにちは。私はJavaです。"; //文字列を入れた変数word
        System.out.println(word.substring(6,12));  //変数wordの6〜11番目を表示
        System.out.println(word.substring(12));  //変数wordの12〜末尾を表示
    }
}
//文字列の一部を置き換える
public class Main {
    public static void main(String[] args) {
        String word = "こんにちは。私はJavaです。"; //文字列を入れた変数word
        word = word.replace("Java","いろは");  //変数wordの文字を書き換える
        System.out.println(word);  //書き換えた文字列を表示
    }
}
//文字列を数値をつなぐ「 文字列 + 数値 」 「 数値 + 文字列 」
public class Main {
    public static void main(String[] args) {
        int a = 10;   //10を入れた変数a
        int b = 20;   //20を入れた変数b
        String question = a + "X" + b + "=?";  //つなげて変数questionに入れる
        System.out.println(question);  //変数questionの文字列を表示
    }
}
//ランダムに値を出す方法
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();  //ランダムな数を出す部品
        System.out.println(rnd.nextInt(10)); //0〜9のランダムな値を表示
    }
}
//毎回違う計算問題を出題するプログラム
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();  //ランダムな数を出す部品 
        int a = rnd.nextInt(100);  //0~99のランダムな数値を出す
        int b = rnd.nextInt(100);  //0~99のランダムな数値を出す
        String question = a + "x" + b + "=?";  //つなげて変数questionに入れる
        System.out.println(question); //変数questionの文字列を表示
    }
}
//データ型を変換【拡大変換】
public class Main {
    public static void main(String[] args){
        double doubleA = 123.5678;   //double型の変数doubleAに値を入れる
        int intA = 12345;  //int型の変数intAに値を入れる
        doubleA = intA;   //intAの値をdoubleAに入れる
        System.out.println(doubleA);  //変数douleAの値を表示
    }
}