/*
 * PTra18_04.java
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

public class PTra18_04 {

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

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		int size = player.size();
			for(int a = 0; a < 1;) {
				Player randomPlayer = player.get((int) Math.floor(Math.random()*size));
				if(randomPlayer.toString().contains("GK")) {
					System.out.println(randomPlayer.toString());
					player.remove(randomPlayer);
					a++;
				}
			}
			for(int a = 0; a < 4;) {
				size = player.size();
				Player randomPlayer = player.get((int) Math.floor(Math.random()*size));
				if(randomPlayer.toString().contains("DF")) {
					System.out.println(randomPlayer.toString());
					player.remove(randomPlayer);
					a++;
				}
			}
			for(int a = 0; a < 4;) {
				size = player.size();
				Player randomPlayer = player.get((int) Math.floor(Math.random()*size));
				if(randomPlayer.toString().contains("MF")) {
					System.out.println(randomPlayer.toString());
					player.remove(randomPlayer);
					a++;
				}
			}
			for(int a = 0; a < 2;) {
				size = player.size();
				Player randomPlayer = player.get((int) Math.floor(Math.random()*size));
				if(randomPlayer.toString().contains("FW")) {
					System.out.println(randomPlayer.toString());
					player.remove(randomPlayer);
					a++;
				}
			}
	}
}
