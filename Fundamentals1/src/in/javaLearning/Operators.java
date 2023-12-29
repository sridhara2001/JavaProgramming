package in.javaLearning;

public class Operators {
	public static void arithmeticOperators() {
		int a = 10;
		int b = 5;
		
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a/b;
		int rem = a % b;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(rem);
	}
	
	public static void unaryOperator(){
		// it will assign first i.e., b = a and then add to a i.e., (a+1)
		int a = 10;
		int b = a++; // post-increment
		System.out.println(a+ " " +b);
		
		// it will add first i.e., a = a + 1 and then assign to b i.e.,(new value)
		int c = 20;
		int d = ++c; // pre-increment
		System.out.println(c+ " " +d);
		
		boolean result = true;
		System.out.println(!result);
		
		int x = 20;
		System.out.println(-x);
		
	}
	
	public static void relationalOperator() {
		int a = 20;
		int b = 10;
		
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
	}
	
	public static void assignmentOperator() {
		int a = 20;
		System.out.println(a);
		int b = 100;
		b += a; // b = b+a
		System.out.println(b);
		b -= a; // b = b-a
		System.out.println(b);
		b *= a; // b = b*a
		System.out.println(b);
		b /= a; // b = b/a
		System.out.println(b);
		b %= a; // b = b%a
		System.out.println(b);
	}
	
	public static void logicalOperator() {
		int x = 20;
		int y = 50;
		boolean res = !(!((x>y) && (x!=y) || (x==y)));
		System.out.println(res);
	}
	
	public static void bitwiseOperator() {
		int x = 10;
		int y = 14;
		System.out.println(x&y); // bitwise AND
		System.out.println(x|y); // bitwise OR
		System.out.println(x^y); // bitwise XOR
		System.out.println(~x+ " "+~y); // bitwise NOT // Formula is ~n = -(n+1)
	}
	
	public static void shiftOperator() {
		int x = 10;
		System.out.println(x<<2); // left shift // Formula x<<n = x*(n times) ie., x*2*2
		
		int y = 20;
		System.out.println(y>>2); // right shift // Formula x<<n = x/(n times) ie., (x/2)/2
	}
	
	public static void instanceOfOperator() {
		String str = "Java";
		System.out.println(str instanceof String);
		System.out.println(str instanceof Object);
	}

	public static void main(String[] args) {
		Operators.arithmeticOperators();
		Operators.unaryOperator();
		Operators.relationalOperator();
		Operators.assignmentOperator();
		Operators.logicalOperator();
		Operators.bitwiseOperator();
		Operators.shiftOperator();
		Operators.instanceOfOperator();
	}

}
