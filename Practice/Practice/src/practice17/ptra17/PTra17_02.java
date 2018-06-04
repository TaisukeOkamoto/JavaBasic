/*
 * PTra17_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice17.ptra17;

import practice17.common.ThrowExceptionUtil;

public class PTra17_02 {
	public static void main(String[] args) {
		try {
			dispInput();
		} catch(Exception e) {
			System.out.println("例外が発生しました");
		}
	}

	public static void dispInput() {

		System.out.println("文字を入力してください");

		/*
		 * 以下の処理はコンパイルエラーになります。
		 * ★ 適切な修正を行い、コンパイルエラーをなくしてください
		 */
		String line = ThrowExceptionUtil.inputValue();

		System.out.println(line);
	}
}
