package practice13.common;

public class Employee extends Person {

	private String departmentNm;
	private int departmentCnt;

	public String getDepartmentNm() {
		return departmentNm;
	}
	public void setDepartmentNm(String departmentNm) {
		this.departmentNm = departmentNm;
	}
	public int getDepartmentCnt() {
		return departmentCnt;
	}
	public void setDepartmentCnt(int departmentCnt) {
		this.departmentCnt = departmentCnt;
	}

}
