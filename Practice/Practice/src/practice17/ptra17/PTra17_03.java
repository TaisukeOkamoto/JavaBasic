/*
 * PTra17_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice17.ptra17;

import java.io.IOException;

import practice17.common.ThrowExceptionUtil;

public class PTra17_03 {
	public static void main(String[] args) {
		quiz();
	}

	public static void quiz() {
		final String[] question = {
				 "Javaの予約語となっている単語は次のうちどれか。\n1:static\t2:Sample\t3:java"
				,"次の中からMicrosoftの製品はどれか。\n1:GitHub\t2:サクラエディタ\t3:SQL Server"
				,"Javaが誕生した年は？（西暦で答えなさい）"
		};
		final int[] answer = {1, 3, 1995};

		int score = 0;

		System.out.println("クイズを始めます");

		/*
		 * ここから、例外処理を含めたプログラムになっています。
		 *
		 * ★入力された値が、数字以外であった場合、
		 * 「回答を数字で入力してください」
		 * から再度入力を求めるような形に仕様変更してください。
		 *
		 */
		try {
			for (int i = 0; i < question.length; i++) {
				System.out.println("問題：" + (i + 1));
				System.out.println(question[i]);

				System.out.println("回答を数字で入力してください");
				String input = ThrowExceptionUtil.inputValue();

				int num = Integer.parseInt(input);

				if (answer[i] == num) {
					score++;
				}
			}
		} catch(IOException e) {
			System.out.println("例外が発生しました");
		} catch(NumberFormatException e) {
			System.out.println("数字以外が入力されました");
		}

		System.out.println("全ての問題が終わりました。");
		System.out.println("あなたの得点は・・・" + score + "点です！");

	}

}
