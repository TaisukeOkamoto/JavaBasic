package practice07;
/*
 * PTra07_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_01 {
	public static void main(String[] args) {

		// ★ int型の配列arrayを宣言してください
		int[] array;

		// ★ 変数arrayの配列を5個の領域で確保してください
		array = new int[5];

		// ★ 変数arrayにそれぞれ、[1,4,7,10,13] を代入してください
		array[0] = 1;
		array[1] = 4;
		array[2] = 7;
		array[3] = 10;
		array[4] = 13;

		// ★ 変数arrayに格納されている値を前から順番に全て表示してください
//		for(int a: array) {
//			System.out.println(a);
//		}
		for(int a = 0;a < array.length;a++) {
			System.out.println(array[a]);
		}

	}
}
