package practice12;

/*
 * PTra12_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
import practice12.common.Student;

public class PTra12_01 {
	public static void main(String[] args) {

		/*
		 * common.Studentにアクセサを追加し、
		 * ★ フィールドのアクセス修飾子を外部クラスからのアクセスを禁止させるようにしてください
		 *
		 * ★ 下記、インスタンスフィールドへのアクセスをアクセサ経由に変更してください
		 */
		Student student = new Student();
		student.studentId = 10001;
		student.studentName = "リゾーム太郎";
		student.companyName = "株式会社リゾーム";
		student.className = "Z教室";
		student.mail = "rhizome@hogehoge.com";
		student.password ="1qazxcvb";

		System.out.println("受講生ID　：" + student.studentId);
		System.out.println("受講生名　：" + student.studentName);
		System.out.println("会社名　　：" + student.companyName);
		System.out.println("教室名　　：" + student.className);
		System.out.println("メール　　：" + student.mail);
		System.out.println("パスワード：" + student.password);
	}
}
