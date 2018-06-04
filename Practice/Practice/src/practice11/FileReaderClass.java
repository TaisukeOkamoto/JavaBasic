package practice11;
/*
 * ReadFileClass.java
 *   作成	IT-College	2016
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * ファイルの読み込みを行います。
 * @author Rhizome
 *
 */
public class FileReaderClass {

	private FileReaderClass() {
		/* インスタンス化を禁止 */
	}

	/**
	 * bookData.csvを読み込み、Bookの配列として取得します。
	 * @return	bookDataの内容をBookインスタンスの配列として変換した形
	 */
	public static Book[] readBookDataFile() {
		String[] fileRow = new String[65536];	/* とりあえずたくさん確保：List<String>を使いたい */
		Book[] bookList = null;				/* 初期値：List<Book>を使いたい */
		int index = 0;

		try(Scanner scanner = new Scanner(new File("csv/bookData.csv"))) {
			while(scanner.hasNext()) {
				fileRow[index] = scanner.nextLine();
				index++;
			}

			bookList = new Book[index];
			for (int i = 0; i < index; i++) {
				String[] rowArray = fileRow[i].split(",");
				bookList[i] = new Book(
								 rowArray[0]	// 本のタイトル
								,rowArray[1]	// 著者
								,Integer.parseInt(rowArray[2])	// 定価
								,Integer.parseInt(rowArray[3])	// ページ数
								,rowArray[4]	// 出版社
							);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりませんでした");
		} catch (Exception e) {
			System.out.println("エラーが発生しました");
		}

		return bookList;
	}
}
