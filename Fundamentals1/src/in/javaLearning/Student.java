package in.javaLearning;

public class Student {
	int id = 1;
	String name = "Sridhar";
	static String collegeName = "Dr. AIT";
	
	public static void main(String[] args) {
		Student obj = new Student();
		Student obj1 = new Student();
		System.out.println(obj.id);
		System.out.println(obj1.name);
		System.out.println(Student.collegeName);

	}

}
