package practice03;
/*
 * PTra03_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra03_07 {
	public static void main(String[] args) {
		// 入力型プログラムです。
		// 下記の命令は、入力型プログラムで必要な記述になります。
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println("１～５までの数字を入力して下さい。");

		// コマンドプロンプトで入力した文字列が変数lineに代入されます
		String line = scanner.nextLine();

		// 文字列を数字に変換して、変数numに代入します
		// ※ コマンドプロンプトで入力された値が、数字ではなかった場合はプログラムがエラーになります
		int num = Integer.parseInt(line);

		//---------------------ここから本題-----------------------
		/*
		 * ★ 以下の仕様に沿ってプログラムを完成させてください
		 *
		 * ●1～5の数字を入力すると、入力した数字を表示
		 * ●1～5以外の数値を入力した場合は、「選択したのは,1～5以外です」を表示
		 *
		 * ※ プログラムは何行書いても良いです
		 */


	}
}
