package in.javaLearning;

public class Method_1 {
	
	// Non-static function
	public void greet() {
		System.out.println("Hello");
	}
	
	public static void greet2() {
		System.out.println("Static function called..!");
	}
	
	public int addNumber() {
		return(10+12);
	}
	
	public void show(String name) {
		System.out.println("Hello " + name);
	}
	public static void main(String[] args) {
		Method_1 obj = new Method_1();
		obj.greet();
		
		Method_1.greet2();
		
		Method_1 obj1 = new Method_1();
		int result = obj1.addNumber();
		System.out.println(result);
		
		System.out.println(obj1.addNumber());

		obj.show("Sridhar Virat");
	}

}
