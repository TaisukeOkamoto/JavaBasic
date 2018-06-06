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
		student.setStudentId(10001);
		student.setStudentName("リゾーム太郎");
		student.setCompanyName("株式会社リゾーム");
		student.setClassName("Z教室");
		student.setMail("rhizome@hogehoge.com");
		student.setPassword("1qazxcvb");

		System.out.println("受講生ID　：" + student.getStudentId());
		System.out.println("受講生名　：" + student.getStudentName());
		System.out.println("会社名　　：" + student.getCompanyName());
		System.out.println("教室名　　：" + student.getClassName());
		System.out.println("メール　　：" + student.getMail());
		System.out.println("パスワード：" + student.getPassword());
	}
}
