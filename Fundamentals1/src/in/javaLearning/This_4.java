package in.javaLearning;

class employeeData{
	employeeData(){
		System.out.println("Defualt Constructor");
	}
	
	employeeData(int a){
		// this keyword must be the first statement of the constructor always (very very Imp)
		this(); // new employeeData()
		System.out.println("Parameterized Constructor");
	}
}

public class This_4 {

	public static void main(String[] args) {
		employeeData emp = new employeeData(10);

	}

}
