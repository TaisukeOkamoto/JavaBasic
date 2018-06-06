package practice11;
/*
 * PTra11_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

import java.util.Scanner;

public class PTra11_02 {
	public static void main(String[] args) {

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します
		Book[] array = FileReaderClass.readBookDataFile();

		System.out.println("探したい本のタイトル（又はその一部）を入力してください");

		// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください

		java.util.Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();

		//部分一致するとき
		for(Book a:array) {

			String arrayTitle = a.title;

			if (arrayTitle.indexOf(line) != -1) {
					 System.out.print(a.title+",");
					 System.out.print(a.author+",");
					 System.out.print(a.price+",");
					 System.out.print(a.pageSize+",");
					 System.out.print(a.publication);
					 System.out.println("");
			}
		}

		//部分一致しないとき
		for(Book a:array) {

			String arrayTitle = a.title;

			if (arrayTitle.indexOf(line) != -1) {
				break;
			}else if (arrayTitle.indexOf(line) == -1) {
				System.out.println("該当なし");
				break;
			}
		}
//		Book[] array = FileReaderClass.readBookDataFile();
//
//		for(int i = 0; i < array.length; i++) {
//			System.out.println(array[i].title);
//		}
	}
}
