package practice03;
/*
 * PTra03_05.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra03_05 {
	public static void main(String[] args) {
		// 入力型プログラムです。
		// 下記の命令は、入力型プログラムで必要な記述になります。
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println("降水確率を入力してください。（数字のみ）");

		// コマンドプロンプトで入力した文字列が変数lineに代入されます
		String line = scanner.nextLine();

		// 文字列を数字に変換して、変数numに代入します
		// ※ コマンドプロンプトで入力された値が、数字ではなかった場合はプログラムがエラーになります
		int num = Integer.parseInt(line);

		//---------------------ここから本題-----------------------
		/*
		 * ★ 以下の仕様に沿ってプログラムを完成させてください
		 *
		 * ●変数numの値が75以上であれば		->	「雨が降る確率が高いです」
		 * ●変数numの値が30～74の範囲であれば	->	「雨が振るかもしれないです」
		 * ●変数numの値が30未満であれば		->	「雨はまず降らないでしょう」
		 * とそれぞれ出力するようにしてください。
		 *
		 * ※ ただし、入力された値が100より大きく、0未満の場合は、「不正な値が入力されました」を出力してください
		 * ※ プログラムは何行書いても良いです
		 */

	}
}
