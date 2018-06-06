/*
 * PTra13_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Hero;

public class PTra13_02 {

	/*
	 * ★ common.Characterクラスを継承した、common.Heroクラスを作成してください
	 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
	 */

	public static void main(String[] args) {
		// ★ common.Heroクラスをインスンタンス化してください
		Hero hero = new Hero(25, 10, 7);

		// ★ common.Heroインスタンスのnameに"勇者"を設定して下さい
		hero.setName("勇者");

		// ★ common.Heroインスタンスのキャラクター情報を表示してください

		System.out.println(hero.showParameter());

	}
}
