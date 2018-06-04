package practice04;
/*
 * PTra04_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra04_03 {
	public static void main(String[] args) {
		int limitNumber = 10;
		int random = 0;

		// ★ ランダムで数値が生成された数値が2であった場合にプログラムが終了する条件式にしてください。
		while () {

			// ★ ランダムで数字を生成するプログラムです。
			// 下記の命令を実行すると変数randomに、0以上、変数limitNumber未満の数字がランダムで代入されます
			random = new java.util.Random().nextInt(limitNumber);

			System.out.println("ランダムで生成された数値：" + random);
		}

		System.out.println("プログラムを終了します。");
	}
}
