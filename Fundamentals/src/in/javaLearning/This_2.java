package in.javaLearning;

class StudentData{
	int studentId = 100;
	String studentName = "Sridhar";
	
	public void showData() {
		System.out.println("Id ="+this.studentId+" Name ="+this.studentName);
	}
	
	public void callFn() {
		this.showData();
	}
}
public class This_2 {

	public static void main(String[] args) {
		StudentData s = new StudentData();
		s.callFn();

	}

}
