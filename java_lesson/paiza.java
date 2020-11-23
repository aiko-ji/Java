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
