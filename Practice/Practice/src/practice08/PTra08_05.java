package practice08;
/*
 * PTra08_05.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra08_05 {
	public static void main(String[] args) {
		// 入力型プログラムです。
		// 下記の命令は、入力型プログラムで必要な記述になります。
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println("図形の横の長さを入力してください");

		// コマンドプロンプトで入力した数値が変数widthに代入されます
		// ※ コマンドプロンプトで入力された値が、数字ではなかった場合はプログラムがエラーになります
		int width = scanner.nextInt();

		System.out.println("図形の縦の長さを入力してください");

		// コマンドプロンプトで入力した数値が変数heightに代入されます
		// ※ コマンドプロンプトで入力された値が、数字ではなかった場合はプログラムがエラーになります
		int height = scanner.nextInt();

		System.out.println("図解の形を選択してください");
		System.out.println("1:四角形   2:三角形");

		// コマンドプロンプトで入力した数値が変数heightに代入されます
		// ※ コマンドプロンプトで入力された値が、数字ではなかった場合はプログラムがエラーになります
		int choice = scanner.nextInt();

		// ★ 変数choiceの中が、1であれば四角形の面積を算出するメソッドを、2であれば三角形の面積を算出するメソッドを呼び出してください

	}

	/*
	 * ★ 以下の仕様でメソッドを作成してください
	 *
	 * 戻り値		：double
	 * メソッド名	：quadrangle
	 * 引数			：double width, double height
	 *
	 * 引数で渡された横の長さ(width)と縦の長さ(height)から、四角形の面積を返すメソッド
	 */


	/*
	 * ★ 以下の仕様でメソッドを作成してください
	 *
	 * 戻り値		：double
	 * メソッド名	：triangle
	 * 引数			：double width, double height
	 *
	 * 引数で渡された横の長さ(width)と縦の長さ(height)から、三角形の面積を返すメソッド
	 */

}
