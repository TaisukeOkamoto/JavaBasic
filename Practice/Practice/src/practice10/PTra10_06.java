package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		Car[] car = new Car[3];
		car[0] = new Car();
		car[1] = new Car();
		car[2] = new Car();

		Car carRed = car[0];
		carRed.color = "red";
		carRed.gasoline = 30;
		Car carBlue = car[1];
		carBlue.color = "blue";
		carBlue.gasoline = 60;
		Car carGreen = car[2];
		carGreen.color = "green";
		carGreen.gasoline = 120;

		final int distance = 300;

		for(int i=0;i < car.length;i++) {
			int restDistance = distance - car[i].run();

			for(int n = 1;car[i].gasoline > 0 && restDistance > 0;n++) {
				restDistance -= car[i].run();
				System.out.println(restDistance);
				if(restDistance <= 0) {
					System.out.println("目的地にまで"+n+"時間かかりました。残りのガソリンは、"+car[i].gasoline+"リットルです");
					break;
				}
				if(car[i].gasoline <= 0) {
					System.out.println("目的地に到達できませんでした");
					break;
				}
			}
		}


	}
}
