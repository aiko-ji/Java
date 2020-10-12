System.out.println("HOll World")
//()の中には""が必要ないとエラー表示になる

System.out.println("HOll World")
//()の中身を出力せよ、と言う命令
//System.out.printlnは（）の中身を出力（表示）せよと言う命令

//Javaの構造
class Main{  //クラス部分
  public static void main(string[]args){  //メソッド部分
    //（ここにコードを書く）　処理部分
  }//メソッドの処理の閉じ
}//クラス部分の閉じ

System.out.println("HOll World");
//Javaは文の終わりにはセミコロン（；）が必須。これを忘れるとコードが動かなくなる

//数値　【数値は””で囲まない様に注意】・【記号と数字の間にはスペースは無くても良いがコードが見やすくするよう心がける】
System.out.println(3);      //コンソール結果　３
System.out.println(5 + 2);  //コンソール結果　７　足し算
System.out.println(8 - 5);  //コンソール結果　３　引き算
System.out.println(3 * 2);  //コンソール結果　６　掛け算
System.out.println(6 / 2);  //コンソール結果　３　割り算
System.out.println(8 % 5);  //コンソール結果　３　割り算の余を出力　（８割る５は、１余り３）

//文字列の連結　【数値と文字列の違いに注意】
System.out.println("Ninja" + "Wanko");  //コンソール結果　NinjaWanko
System.out.println("5" + "3");          //コンソール結果　53
System.out.println(5 + 3);              //コンソール結果　８

//変数の定義　データ型
"Hello World"//(文字列)・・・String型（文字列の並び）
３//(整数)・・・・・・・・・・・int型s整数の意味（英語読み＝integer）

//変数とはデータを入れておく箱の様なもの。その箱（変数）には変数名（名前）がついている
//int型の変数定義　int number;     int(データ型)　number;(変数名)
//Stringの変数定義　String name;   String(データ型)　mane(変数名)

//値の代入　【今回"３"”Sato”を変数名に値を代入する】
int number;
number = 3;  //(=に代入する)
String name；
name = "Sato"

//変数から値を取り出す
int number;
number = 10;
System.out.println(number);      //コンソール結果　10
String name;
name = "Sato";
System.out.println(name);        //コンソール結果　Sato
