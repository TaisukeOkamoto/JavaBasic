package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */

		for(int i=1;i <= 10;i++) {
			for(int j = 1;j <= 5;j++) {
				if(i <= 6) {
					if(j >= i) {
						System.out.print("□");
					} else {
						System.out.print("■");
					}
				} else {
					if(j <= 5 - i % 6) {
						System.out.print("■");
					} else {
						System.out.print("□");
					}
				}
			}
			System.out.println("");
		}

	}
}
