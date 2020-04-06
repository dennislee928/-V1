
public class Course {
	String courseID;
	String courseName;
	int credits;

	public Course(String id, String name, int credits) {
		this.courseID = "" + id;
		this.courseName = name;
		this.credits = credits;

	}

	public String CourseSetter() {
		return this.courseID + this.courseName + this.credits;
	}

	public String toString() {
		String summary = ("[CourseID:" + this.courseID + ", " + "CourseNam:" + this.courseName + ", " + "Credits:"
				+ this.credits + "]");
		return summary;
	}
//
}
