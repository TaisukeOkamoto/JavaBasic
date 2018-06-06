/*
 * PTra13_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Hero;
import practice13.common.Slime;

public class PTra13_04 {

	/*
	 * ★ PTra13_02, PTra13_03で作成した、Hero/Slimeクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ HeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者", "スライム"を設定してください
		Hero hero = new Hero(25, 10, 7);
		hero.setName("勇者");
		Slime slime = new Slime(10, 5, 2);
		slime.setName("スライム");

		/*
		 * ★ HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */

			while(true) {
				System.out.println(hero.getName()+"の攻撃");
				if(slime.damage(hero.attack()) == true) {
					System.out.println(hero.getName()+"は"+slime.getName()+"との戦闘に勝利した");
					break;
				}
				System.out.println(slime.getName()+"の攻撃");
				if(hero.damage(slime.attack()) == true) {
					System.out.println(slime.getName()+"は"+hero.getName()+"との戦闘に勝利した");
					break;
				}
			}


		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

	}
}
