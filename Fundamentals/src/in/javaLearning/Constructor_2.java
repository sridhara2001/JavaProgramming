package in.javaLearning;

class Employee{
	int empId;
	String empName;
	
	// parameterized constructor
	public Employee(int id, String name){
		empId = id;
		empName = name;
	}
	
	public void showData() {
		System.out.println("id :"+empId+" name :"+empName);
	}
}

class Constructor_2 {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Sridhar");
		e1.showData();
		Employee e2 = new Employee(102, "Virat");
		e2.showData();

	}

}
