package practice09;
/*
 * PTra09_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

import practice09.util.Util;

public class PTra09_02 {
	public static void main(String[] args) {
		String[] array = {"Plain", "Island", "Mountain", "Swamp", "Forest"};

		// ★ 配列arrayを、Util内のメソッドを用いてランダムに並び替えてください
		// ※ Utilはインポートしても良いし、完全限定名で記述しても良いです

		array = Util.shuffleArray(array);


		// ★ ランダムに並び替えた後の配列を前から順に全て表示してください

		for(String a: array) {
			System.out.println(a);
		}

	}
}
