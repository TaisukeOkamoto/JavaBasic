package practice02;
/*
 * PTra02_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra02_09 {
	public static void main(String[] args) {
		int length = 9;	// 底辺
		int height = 23;	// 高さ

		// ★ 変数quadrangleに、四角形の面積を代入してください
		int quadrangle = length * height;

		// ★ 変数quadrangleを出力してください
		System.out.println(quadrangle);

		// ★ 変数triangleに、三角形の面積を代入してください
		double triangle = quadrangle / 2;

		// ★ 変数triangleを出力してください
		System.out.println(triangle);

	}
}
