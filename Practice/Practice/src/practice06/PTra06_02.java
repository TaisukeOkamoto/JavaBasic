package practice06;
/*
 * PTra06_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_02 {
	public static void main(String[] args) {

		// ★ 20回繰り返しを行うfor文を記述してください
		//-----for start
		for(int i = 1; i <= 20;i++ ) {

			// ★ 今何回目の処理なのかを出力してください
			System.out.println(i+"回目");

			// ★ 奇数回のときには、「奇数」を出力してください
			if(i % 2 != 0) {
				System.out.println("奇数");
			}

		}
		//-----for end
	}
}
