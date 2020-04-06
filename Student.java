import java.util.*;

public class Student {
	String studentID;
	String studentName;
	ArrayList<String> enrolledCourses = new ArrayList<String>();
	int currentCredits;
	int maxCredits;

	public Student(String studentID, String name) {
		this.studentID = studentID;
		this.studentName = name;
		this.currentCredits = 0;
		this.maxCredits = 25;

	}

	public String StudentGetter() {
		return this.studentID + this.studentName + this.enrolledCourses + this.currentCredits + this.maxCredits;
	}

	public void StudentSetter(int currentCredits, int maxCredits) {
		this.currentCredits = currentCredits;
		this.maxCredits = maxCredits;
	}

	public String toString() {
		String summary = ("[StudentID:" + this.studentID + ", " + "StudentName:" + this.studentName + ", "
				+ "EnrolledCourses:" + this.enrolledCourses + ", " + "CurrentCredits:" + this.currentCredits + ", "
				+ "MaxCredits:" + this.maxCredits + "]");
		return summary;

	}

}////
