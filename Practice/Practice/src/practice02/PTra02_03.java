package practice02;
/*
 * PTra02_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra02_03 {
	public static void main(String[] args) {
		int num1 = 50;
		System.out.println(num1);

		// ★ 演算の評価の順番を変更して、num2に140が入るようにしてください(先に足し算が行われるよう変更)
		int num2 = (20 + num1) * 2;

		// 140が表示されること
		System.out.println(num2);	// ※※ この行は修正しないでください
	}
}
