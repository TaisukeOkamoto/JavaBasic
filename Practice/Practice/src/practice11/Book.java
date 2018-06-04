package practice11;
/*
 * Book.java
 *   作成	IT-College	2016
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
import java.text.NumberFormat;

/**
 * 本の情報を保持します
 * @author Rhizome
 *
 */
public class Book {

	/**
	 * コンストラクタの定義。
	 * 本の情報を予め指定してインスタンスを作成します
	 * @param title	本のタイトル
	 * @param author	著者名
	 * @param price	定価
	 * @param pageSize	ページ数
	 * @param publication	出版社
	 */
	Book(String title, String author, int price, int pageSize, String publication) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.pageSize = pageSize;
		this.publication = publication;
	}

	/** 本のタイトル */
	String title;

	/** 著者 */
	String author;

	/** 定価 */
	int price;

	/** ページ数 */
	int pageSize;

	/** 出版社 */
	String publication;

	/**
	 * 本の情報を文字列で取得します
	 */
	String dispBookInfo() {

		// 通貨形式で出力するときに必要
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

		// 本情報の文字列生成
		StringBuilder str = new StringBuilder();
		str.append("本のタイトル：");
		str.append(this.title);
		str.append("\n");
		str.append("著者　　　　：");
		str.append(this.author);
		str.append("\n");
		str.append("定価　　　　：");
		str.append(currencyFormat.format(this.price));
		str.append("(税抜)");
		str.append("\n");
		str.append("ページ数　　：");
		str.append(this.pageSize);
		str.append("ページ");
		str.append("\n");
		str.append("出版社　　　：");
		str.append(this.publication);

		return str.toString();

	}
}
