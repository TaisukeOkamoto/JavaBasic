package practice03;
/*
 * PTra03_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */


public class PTra03_09 {
	public static void main(String[] args) {
		/*
		 * ★ 以下の仕様に沿ってプログラムを完成させてください
		 *
		 * ●入力型プログラミングとしてください
		 * ●０～６までの数字を入力してもらいます
		 * ●０：日曜～６：土曜を、それぞれ入力された数字から判断して出力します
		 * ●０～６以外の場合は、「0～6の整数を入力してください」と出力します
		 *
		 * ※ プログラムは何行書いても良いです
		 */

		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int num = scanner.nextInt();
		String week;

//		if(num == 0) {
//			week = "日曜";
//		} else if(num == 1) {
//			week = "月曜";
//		} else if(num == 2) {
//			week = "火曜";
//		} else if(num == 3) {
//			week = "水曜";
//		} else if(num == 4) {
//			week = "木曜";
//		} else if(num == 5) {
//			week = "金曜";
//		} else if(num == 6) {
//			week = "土曜";
//		} else {
//			week = "0～6の整数を入力してください";
//		}

		switch(num) {
		case 0:
			week = "日曜";
			break;
		case 1:
			week = "月曜";
			break;
		case 2:
			week = "火曜";
			break;
		case 3:
			week = "水曜";
			break;
		case 4:
			week = "木曜";
			break;
		case 5:
			week = "金曜";
			break;
		case 6:
			week = "土曜";
			break;
		default:
			week = "0～6の整数を入力してください";
		}

		System.out.println(week);
	}
}
