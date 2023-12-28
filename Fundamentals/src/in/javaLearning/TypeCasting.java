package in.javaLearning;

public class TypeCasting {

	public static void implicitTypeCasting() {
		byte a = 120;
		short b = a; // implicit typeCasting
		System.out.println(b);
	}
	
	public static void explicitTypeCasting() {
		short a = 120;
		byte b = (byte) a; // explicit typeCasting
		System.out.println(b);
		
		short a1 = 160;
		byte b1 = (byte) a1; // explicit typeCasting
		System.out.println(b1);
	}
	
	public static void main(String[] args) {
		TypeCasting.implicitTypeCasting();
		TypeCasting.explicitTypeCasting();

	}

}
