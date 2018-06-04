/*
 * Java2Month.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice15.common;

public class Java2Month extends Room {

	/**
	 * カリキュラムを取得します
	 * @return	カリキュラム一覧を格納した配列
	 */
	public String[] getCurriculum() {

		String[] array = {
				"ビジネスマナー"
				,"Javaプログラミング"
				,"オブジェクト指向プログラミング"
				,"DB基礎"
				,"設計・テスト手法入門"
				,"Webプログラミング"
				,"JavaEE開発実習"
			};

		return array;
	}
}
