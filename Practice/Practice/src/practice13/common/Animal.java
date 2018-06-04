/*
 * Animal.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.common;

/**
 * 動物の情報や行動を持ったクラスです
 * @author rhizome
 *
 */
public class Animal {
	/** 名前 */
	private String name;

	/**
	 * 行動：走る
	 */
	public void run() {
		System.out.println(this.name + "は走る");
	}

	/**
	 * 行動：呼吸
	 */
	public void breath() {
		System.out.println(this.name + "は呼吸する");
	}

	/**
	 * Setter
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter
	 * @return
	 */
	public String getName() {
		return this.name;
	}

}
