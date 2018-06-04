/*
 * Character.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.common;

/**
 * 登場するキャラクターの情報とデフォルトの行動を設定したクラスです
 * @author rhizome
 *
 */
public class Character {
	/** 名前 */
	private String name = "キャラクター";

	/** 体力 */
	private int hp;

	/** 力 */
	private int power;

	/** 防御力 */
	private int endurance;

	/**
	 * 体力、攻撃力、防御力の初期値を設定しつつ、Characterインスタンスを生成します
	 * @param hp
	 * @param attack
	 * @param defence
	 */
	public Character(int hp, int power, int endurance) {
		this.hp = hp;
		this.power = power;
		this.endurance = endurance;
	}

	/**
	 * 名前を設定します
	 * @param name	設定したい名前
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 名前を取得します
	 * @return 名前
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 攻撃を行います
	 * @return 相手に与えるダメージを返します
	 */
	public int attack() {
		return this.power;
	}

	/**
	 * ダメージ判定を行います
	 * @param attack 攻撃値
	 * @return	体力が0になったらtrue、まだ体力が残っていたらfalse
	 */
	public boolean damage(int attack) {
		// ダメージ計算
		int calc = attack - this.endurance;
		if (calc <= 0) {
			// 必ず1ダメージは入るようにする
			calc = 1;
		}

		// ダメージ分体力を減らす
		this.hp -= calc;

		// 体力がなくなったかどうかの判定
		if (this.hp <= 0) {
			this.hp = 0;
			return true;
		}

		return false;
	}

	/**
	 * キャラクター情報を表示します
	 * @return
	 */
	public String showParameter() {
		StringBuilder str = new StringBuilder();

		str.append("名　前：" + this.name);
		str.append("\n");
		str.append("体　力：" + this.hp);
		str.append("\n");
		str.append("　力　：" + this.power);
		str.append("\n");
		str.append("耐　久：" + this.endurance);

		return str.toString();
	}
}
