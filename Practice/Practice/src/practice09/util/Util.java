/*
 * Util.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice09.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 様々なメソッドを集めたJavaプログラムです。
 * util.Utilをインポートして使用してください。
 * 各メソッドの使い方に関しては、メソッドの説明を参照してください。
 *
 * @author Rhizome
 *
 */
public class Util {
	private Util() {
		/* インスタンス化を禁止するため、private化 */
	}

	/**
	 * 文字列を、1文字ずつ指定された秒数間隔をあけて表示します。
	 * @param message	表示する文字列
	 * @param millisecond	間隔をあけるミリ秒（1000で1秒）
	 */
	public static void dispMessageSlowly(String message, long millisecond) {
		char[] array = message.toCharArray();
		for (int i = 0; i < message.length(); i++) {
			System.out.print(array[i]);
			try {
				Thread.sleep(millisecond);
			} catch (InterruptedException e) {
				/* エラーが発生した場合はここにくる */
			}
		}
	}

	/**
	 * 配列の中身をシャッフルした結果を取得します。
	 * @param array	シャッフルしたい配列
	 * @return		シャッフルした結果の配列
	 */
	public static String[] shuffleArray(String[] array) {
		List<String> list = Arrays.asList(array);
		Collections.shuffle(list);
		return (String[]) list.toArray();
	}

}