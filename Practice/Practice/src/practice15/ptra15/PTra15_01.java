/*
 * PTra15_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice15.ptra15;

import practice15.common.Course;
import practice15.common.DBCourse;
import practice15.common.JavaCourse;

public class PTra15_01 {

	public static void main(String[] args) {

		JavaCourse jCourse = new JavaCourse();
		DBCourse dbCourse = new DBCourse();

		// ★ Course[	]の配列に jcourse と dbCourse のインスタンスを代入してください。

		for (Course course : courseList) {
			System.out.println(course.getCourseName());
		}
	}

}
