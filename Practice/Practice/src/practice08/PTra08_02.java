package practice08;
/*
 * PTra08_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra08_02 {
	public static void main(String[] args) {

		int x = 100;
		int y = 50;

		// ★ 変数receiveを宣言して、averageメソッドを（変数x, 変数y）で呼び出した結果を代入してください


		// ★ 変数receiveを出力してください

	}

	/*
	 * 以下の仕様でメソッドを作成しました
	 *
	 * 戻り値		：String
	 * メソッド名	：average
	 * 引数			：int x, int y
	 *
	 * 引数で渡された２つのint型の平均値を返すメソッド
	 */
	public static String average(int x, int y) {

		String result = "平均は：" + ((x + y) / 2);
		return result;

	}
}
