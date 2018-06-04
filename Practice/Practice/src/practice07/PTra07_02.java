package practice07;
/*
 * PTra07_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_02 {
	public static void main(String[] args) {

		// ★ int型の配列arrayを宣言し、1000個の領域で確保してください
		int[] array;
		array = new int[1000];

		// ★ 配列arrayに [1,2,3,4,5,6,7,・・・・,998,999,1000] を代入してください
		for(int i = 1;i <= 1000;i++) {
			array[i - 1] = i;
		}

		// ★ 変数arrayに格納されている値を前から順番に全て表示してください
		for(int a: array) {
			System.out.println(a);
		}

	}
}
