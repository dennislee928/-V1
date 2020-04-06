import java.util.*;

public class Register {
	public ArrayList<Student> studentList;
	ArrayList<Course> courseList;

	public Register() {
		// Register r1=new Register();
		// r1.studentList=new ArrayList<Student>();
		// r1.courseList= new ArrayList<Course>();

		ArrayList<Student> studentList = new ArrayList<Student>();
		this.studentList = studentList;

		ArrayList<Course> courseList = new ArrayList<Course>();
		this.courseList = courseList;

	}

	public void addStudent(String id, String name) {
		Student student = new Student(id, name);
		studentList.add(student);
	};

	public void addCourse(String id, String name, int credits) {
		Course course = new Course(id, name, credits);
		this.courseList.add(course);

	}

	public Student findStudent(String studentID) {
		Student a = null;
		for (Student e : studentList) {
			if (e.studentID == studentID) {
				a = e;
			}
		}
		return a;
	}

	public Course findCourse(String courseID) {
		Course b = null;
		for (Course e : courseList) {
			if (e.courseID == courseID) {
				b = e;
			}
		}
		return b;
	}

	public boolean enrollCourse(String studentID, String courseID) {
		boolean x = false;
		Student a = null;

		for (Student e : studentList) {
			if (studentID == e.studentID) {
				a = e;

			} else
				a = null;
		}
		Course b = null;
		for (Course e : courseList) {
			if (e.courseID.contains(courseID) == true) {
				b = e;

			} else
				b = null;
		}
		if (a != null && b != null && (a.currentCredits + b.credits) <= a.maxCredits) {

			if (a.enrolledCourses.contains(courseID) == false) {
				a.currentCredits = a.currentCredits + b.credits;

				System.out.println(a.enrolledCourses);
				a.enrolledCourses.add(courseID);
				x = true;

			} else
				x = false;

		} else
			x = false;

		return x;
	}

	public boolean dropCourse(String studentID, String courseID) {
		boolean x = false;
		Student a = null;
		for (Student e : studentList) {
			if (e.studentID == studentID) {
				a = e;
			}
		}
		Course b = null;
		for (Course e : courseList) {
			if (e.courseID.contains(courseID) == true) {
				b = e;
			}
		}
		if (a != null && b != null && a.enrolledCourses.contains(courseID) != false) {
			a.currentCredits = a.currentCredits - b.credits;
			a.enrolledCourses.remove(courseID);
			x = true;
		} else
			x = false;
		return x;
	}

	// TEST----------------------------------------------------------------------------------------------
	public static void main(String[] args) {

	}
}