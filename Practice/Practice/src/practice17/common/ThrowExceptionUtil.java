/*
 * ThrowExceptionUtil.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice17.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 例外を発生させるようなメソッドを集めたクラスです
 * @author rhizome
 *
 */
public class ThrowExceptionUtil {
	private ThrowExceptionUtil() {
		/* インスタンス化の禁止 */
	}

	/**
	 * 引数にnullを渡すと、NullPointerExceptionが発生します
	 * @param value	nullを渡して、例外を起こしてください
	 * @return	例外が起きなければそのまま返ってきます
	 */
	public static String nullToBlank(String value) {
		if (value.trim() == null) {
			return "";
		}
		return value;
	}

	/**
	 * 入力型プログラミングです。
	 * ユーザに入力してもらった文字列を取得します。
	 * @return	入力された文字列
	 * @throws IOException
	 */
	public static String inputValue() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		return reader.readLine();
	}
}
