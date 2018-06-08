/*
 * PTra18_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Player;

public class PTra18_02 {

	/*
	 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
	 *
	 * フィールド
	 * 		position	：	String
	 * 		name		：	String
	 * 		country		：	String
	 * 		team		：	String
	 * メソッド
	 * 		各アクセサ
	 *
	 * 		toString()	：	Objectクラスのオーバーライド
	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
	 */

	public static void main(String[] args) {

		/*
		 * entity.Playerの作成後に行ってください
		 *
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> player = new ArrayList<Player>();
		int i = 0;
		//リストの番号を初期化
		try {
			Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"));
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] lineString = line.split(",");
				//リストの一行を配列に変換
					player.add(new Player());
					// playerインスタンス生成
					player.get(i).setPosition(lineString[0]);
					player.get(i).setName(lineString[1]);
					player.get(i).setCountry(lineString[2]);
					player.get(i).setTeam(lineString[3]);
					//i番目のplayerにそれぞれ情報を格納
					i++;
					//次回繰り返し時、iに1を足す。
 			}
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}


		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
		// ※ できれば拡張for文を使いましょう
		for(Player p :player) {
			System.out.println(p.toString());
		}

	}
}
