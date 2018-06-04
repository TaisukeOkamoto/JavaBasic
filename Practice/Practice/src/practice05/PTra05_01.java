package practice05;
/*
 * PTra05_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra05_01 {
	public static void main(String[] args) {

		// ★ int型の変数numを宣言し、5で初期化してください
		int num = 5;

		/*
		 *  ★ 以下の仕様で、switch文を記述してください
		 *
		 *  ●numが5だった場合			->	「満点」
		 *  ●numが4だった場合			->	「合格点」
		 *  ●numが3だった場合			->	「もう少しで合格」
		 *  ●numが2だった場合			->	「不合格」
		 *  ●numが1だった場合			->	「もう少しがんばりましょう」
		 *  ●numが0だった場合			->	「前の単元を復習してください」
		 *  ●numが0～5以外だった場合	->	「正しい数値を入れてください」
		 */
		switch(num) {
		case 5:
			System.out.println("満点");
			break;
		case 4:
			System.out.println("合格点");
			break;
		case 3:
			System.out.println("もう少しで合格");
			break;
		case 2:
			System.out.println("不合格");
			break;
		case 1:
			System.out.println("もう少しがんばりましょう");
			break;
		case 0:
			System.out.println("前の単元を復習してください");
			break;
		default:
			System.out.println("正しい数値を入れてください");
		}

	}
}
