/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> player = new ArrayList<Player>();
		int i = 0;
		try {
			Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"));
			while(scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] lineString = line.split(",");
				player.add(new Player());
				player.get(i).setPosition(lineString[0]);
				player.get(i).setName(lineString[1]);
				player.get(i).setCountry(lineString[2]);
				player.get(i).setTeam(lineString[3]);
				i++;
			}
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}



		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
		for(Iterator<Player> it = player.iterator();it.hasNext();) {
			Player name = it.next();
			if(name.toString().contains("レアル・マドリード")) {
				it.remove();
			} else if(name.toString().contains("バルセロナ")) {
				it.remove();
			}
		}

		// ★ 削除後のArrayListの中身を全件出力してください
		for(Player p:player) {
			System.out.println(p.toString());
		}


	}
}
