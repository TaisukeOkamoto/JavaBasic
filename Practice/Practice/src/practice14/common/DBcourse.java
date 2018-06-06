package practice14.common;

public class DBcourse implements Course {

	String COURSE = "DB基礎";
	String[] ARRAYLIST = {"DB基礎","SQL基礎","正規化","SQL応用"};

	public String getCourseName() {
		return PREFIX + COURSE;
	}

	public String[] getCourseUnit() {
		return ARRAYLIST;
	}

}
