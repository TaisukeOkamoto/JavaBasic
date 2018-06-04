/*
 * Person.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.common;

/**
 * ユーザ情報を保持するクラスです
 * @author rhizome
 *
 */
public class Person {
	/** 基準値 */
	public static final int BASE_NO = 1000;

	/** ユーザID */
	public int userId;
	/** ユーザ名 */
	public String userNm;
	/** メールアドレス */
	public String mail;
	/** パスワード */
	public String password;
	/**
	 * ユーザIDを取得します
	 * @return ユーザID
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * ユーザIDを設定します
	 * @param userId	設定したいユーザID
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * ユーザ名を取得します
	 * @return ユーザ名
	 */
	public String getUserNm() {
		return userNm;
	}
	/**
	 * ユーザ名を設定します
	 * @param userNm	設定したいユーザ名
	 */
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	/**
	 * メールアドレスを取得します
	 * @return メールアドレス
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * メールアドレスを設定します
	 * @param mail	設定したいメールアドレス
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	/**
	 * パスワードを取得します
	 * @return	パスワード
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * パスワードを設定します
	 * @param password	設定したいパスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
