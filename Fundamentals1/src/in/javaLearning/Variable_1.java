package in.javaLearning;

public class Variable_1 {
	int a = 100; // instance variable
	public static void main(String[] args) {
		// className objName = new className();
		Variable_1 obj = new Variable_1();
		//System.out.println(obj instanceof Variable_1);

		// accessing instance variable: objName.varName
		System.out.println(obj.a);
		
		System.out.println("---------------");
		Variable_1 obj2 = new Variable_1();
		System.out.println(obj2.a);
		obj.a = 500;
		System.out.println(obj.a);
		System.out.println(obj2.a);

	}

}
