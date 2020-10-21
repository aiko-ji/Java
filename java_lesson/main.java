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

//変数の初期化

int number = 3;   //int number(変数の定義)・=(代入)
String text = "Hello World";

//*変数雨の定義と同時に値を代入（＝変数を初期化）


//int型変数の計算　【数値の入った変数なら、数値と同様計算ができる、数値と変数の計算、変数同士の計算も可能】
int number1 = 10;
System.out.println(number1 + 3);  //コンソール結果13
int number2 = 5;
System.out.println(number1 + number2);  //コンソール結果15

//String型変数の連結　【文字列に入った変数であれば、文字列と同様、文字列の連結を行うことができる】
String greeting = "こんにちは";
System.out.println(greeting + "佐藤さん");　　　//コンソール結果　こんにちは佐藤さん
String name ="鈴木さん";
System.out.println(greeting + name);  　　　　 //コンソール結果　こんにちは鈴木さん
//name（変数名には""をつけない）
//変数の更新【変数は中に入っている値を変更することができる】

//変数の更新【代入されている変数の値を後に別の値に上書きをすることが出来る】
String name = "Sato";//(変数の定義)　　　コンソール結果　Sato
System.out.println(name);
name ="Suzuki";//(変数の中身の上書き)　　　コンソール結果　Suzuki
System.out.println(name);
//変更時の注意点
//間違った値の更新方法
int number = 3;
int number = 5;  //新しい変数を定義しようとしているが、「同じ名前の変数は定義出来ない」為エラーになる
//正しい値の更新
int number = 3;
number = 5;  //値を更新する時はデータ型をつけない！

//自己代入【変数xに3が入っているとき、xの値に2を足して5に上書きしたい場合はどうすればよいか】
int x = 3;
System.out.println(x);    //コンソール結果　３
x = x + 2;  //(x + 2;)変数のxの値「３」にを足したものをxに代入
System.out.println(x);　　//コンソール結果　５

//自己代入の省略した書き方【自己代入には省略した書き方がある】
  //基本形　　　　略称形
x = x + 10;   x += 10;
x = x - 10;   x -= 10;
x = x * 10;   x *= 10;
x = x / 10;   x /= 10;
x = x % 10;   x %= 10;

//自己代入の省略　１を足す、１を引く　【値が１の時だけさらに省略して書ける】
x = x + 1;   x += 1;   x++;//(略称)
x = x - 1;   x -= 1;   x--;//(略称)

//変数の役割と注意点　なぜ変数を使うのか
//  1,何のデータか分かりやすい為
//  2,同じデータを繰り返し使える
//  3,変更に対応しやすい

//変数の役割
//変数を使わない場合
System.out.println("Aさん、ProgateでJavaをマスターしましょう");
System.out.println("Bさん、ProgateでJavaをマスターしましょう");
System.out.println("Cさん、ProgateでJavaをマスターしましょう");
//「Java」の部分を「プリグラミング」に書き換えるなら３箇所全て変更しなければならない

//変数を使った場合
String text = "ProgateでJavaをマスターしましょう"；
System.out.println("Aさん、" + text);
System.out.println("Bさん、" + text);
System.out.println("Cさん、" + text);
//「Java」の部分を「プログラミング」に書き換えるなら、代入する文字列を１箇所変更するだけで良い

//変数の注意点【変数には決まりがある、userNameの様に２語以上の変数名を使う時は単語の初めを大文字にして区切る。この記述法をキャメルケースという】
   //良い例
date       //英単語を用いる
userName   //２語以上の場合は大文字で区切る（キャメルケース）

  //悪い例【✖️エラーが出る、△望ましくない】
1name      //✖️数字開始
first_name //△アンダーバー（スネークスネークケース）
namae      //△ローマ字
名前        //△日本語

//変数名【変数名を決める時は何のデータが入っているのか分かりやすく名前をつける】
String number ="Sato"    //✖️中に入っている値を意味しない変数名
String lastName = "Sato" //○中にどんな値が入っているかを把握しやすい変数名

//double型（少数）【これまで数値は、int型（整数）しか使ってきませんでしたが、小数を表すデータ型も存在します。そのひとつがdouble型です】
5//(整数)      int型
3.14//（少数）   double型

//double型の変数【３はint型・3.14はdouble型】
double number = 5.28;
System.out.println(number);   //コンソール結果  5.28

//少数同士の計算【double型も数値なので、計算をする事もある】
double number1 = 8.5;
double number2 = 3.4;
System.out.println(number1 + number2);   //コンソール結果　11.9
System.out.println(number1 - number2);   //コンソール結果　5.1

//型変換について
//「+」などの操作は同じデータ型同士でないとできません。よって型の違うものを演算するときは、型を変換し同じ型にしてあげます。
//Javaではこの型変換の方法として、自動の変換と手動の変換があります。
//まずは自動型変換を学びましょう。下図のようにString型とint型を足すと、int型が自動でString型に変換され、文字列の結合が行われます。

System.out.println("佐藤さんは"+23+"際です");  //コンソール結果　佐藤さんは２３際です
//23（String型に変換される）　「”佐藤さんは”＋”２３”＋”際です”」と変換される

//数値の計算の注意点
System.out.println(5 / 2);//(int型同士の計算)　　　　　　コンソール結果　２(int型)
System.out.println(5.0 / 2.0);//(double型同士の計算)　　コンソール結果　2.5（double型）

//計算時の自動型変換【int型とdouble型で計算をするとdouble型になる。Javaが自動変換してくれる】
System.out.println(5.0 / 2); 　　//コンソール結果　2.5
//(5.0 / 2)→(5.0 / 2.0)double型に変換される

//int型同士の計算
int number1 = 13;
int number2 = 4;
System.out.println(number1 / number2);    //コンソール結果　３　＊3.25とはならない
//（number1 / number2）int型同士の割り算
