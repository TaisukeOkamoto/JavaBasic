/*
 * Room.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice15.common;

import java.util.Date;

public class Room {
	/** 教室名 */
	private String className;
	/** 担当講師 */
	private String instructor;
	/** 開始日 */
	private Date startDate;

	/**
	 * 教室名を取得します
	 * @return 教室名
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * 教室名を設定します
	 * @param className	設定したい教室名
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	/**
	 * 担当講師を取得します
	 * @return	担当講師
	 */
	public String getInstructor() {
		return instructor;
	}
	/**
	 * 担当講師を設定します
	 * @param instructor	設定したい担当講師
	 */
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	/**
	 * 開始日を取得します
	 * @return	開始日
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * 開始日を設定します
	 * @param startDate	設定したい開始日
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
}
