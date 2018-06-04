package practice04;
/*
 * PTra04_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra04_01 {
	public static void main(String[] args) {
		// ★ int型の変数numを宣言し、2で初期化してください
		int num =2;

		// ★ 条件式に、変数numが100を超えた場合にfalseになるような条件を記述してください
		while (num < 100) {

			// ★ 変数numを2乗した数を変数numに代入してください
			num *= num;

			// ★ 変数numの値を出力してください
			System.out.println(num);

		}
		System.out.println("プログラムを終了します");
	}
}
