public class RegisterTester {
	public static void main(String[] args) {

		Student student = new Student("1234", "A");
		System.out.println(student.toString());

		Course course = new Course("12345", "CC", 3);
		System.out.println(course.toString());

		Register register = new Register();
		register.addStudent("12345AS", "A");
		register.addCourse("99ss", "ABC", 4);

		System.out.println("!!!!!!!!!!!!)))))))))))))):" + register.courseList);

		System.out.println(register.findCourse("12345AS"));
		System.out.println(register.findStudent("99ss"));
		System.out.println(register.findStudent("12345AS"));
		System.out.println(register.findCourse("99ss"));

		System.out.println(register.enrollCourse("12345AS", "99ss")); // true

		System.out.println(register.enrollCourse("12345AS", "99ss")); // false
		System.out.println(register.enrollCourse("12345AS", "99ss123")); // false
		System.out.println(register.enrollCourse("12345AS222", "99ss")); // false
		System.out.println(register.dropCourse("12345AS", "99ss")); // true
		System.out.println(register.dropCourse("12345AS", "99ss")); // false
		System.out.println(register.dropCourse("12345AS", "99ss123")); // false
		System.out.println(register.dropCourse("12345AS222", "99ss")); // false
	//}

}}