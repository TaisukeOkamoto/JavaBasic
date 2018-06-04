package practice15.common;

public class DBCourse implements Course {

	@Override
	public String getCourseName() {
		return PREFIX + "DB基礎";
	}

	@Override
	public String[] getCourseUnit() {
		return new String[]{
				"DB基礎"
				,"SQL基礎"
				,"正規化"
				,"SQL応用"
		};
	}

}
