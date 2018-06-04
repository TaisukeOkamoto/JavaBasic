package practice03;
/*
 * PTra03_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra03_03 {
	public static void main(String[] args) {
		// 入力型プログラムです。
		// 下記の命令は、入力型プログラムで必要な記述になります。
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println("数字を入力してください");

		// コマンドプロンプトで入力した文字列が変数lineに代入されます
		String line = scanner.nextLine();

		// 文字列を数字に変換して、変数numに代入します
		// ※ コマンドプロンプトで入力された値が、数字ではなかった場合はプログラムがエラーになります
		int num = Integer.parseInt(line);

		//---------------------ここから本題-----------------------
		// ★ 入力された値が、3で割り切れる数字か判定する条件式を記述してください
		if (num % 3 == 0) {
			System.out.println("3で割り切れる数字です");
		} else {
			System.out.println("3で割り切れない数字です");
		}

	}
}
