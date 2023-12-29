package in.javaLearning;

class Vehicle{
	int wheels;
	String name;
	String color;
	
	Vehicle(int w, String n, String c){
		wheels = w;
		name = n;
		color = c;
	}
	// copy constructor
	Vehicle(Vehicle v1){
		wheels = v1.wheels;
		name = v1.name;
		color = v1.color;
	}
	
	public void show() {
		System.out.println("Wheels :"+wheels+" Name :"+name+" Color :"+color);
	}
}
public class Constructor_3 {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle(18, "Audi", "Blue");
		v1.show();
		
		Vehicle v2 = new Vehicle(v1);
		v2.show();
		
	}

}
