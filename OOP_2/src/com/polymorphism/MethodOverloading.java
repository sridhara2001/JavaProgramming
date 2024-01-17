package com.polymorphism;

class Dimension{
	public void area(int radius) {
		System.out.println("Area of Circle : "+Math.PI*radius*radius);
	}
	// Method overloading doesn't depend on return type
	// Method Overloading with different no. of parameters
	public void area(int length, int breadth) {
		System.out.println("Area of Rectangle : "+length*breadth);
	}
	// Method Overloading with same no. of parameters but different data type
	public void area(float side) {
		System.out.println("Area of Square : "+side*side);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Dimension d = new Dimension();
		d.area(12); // integer type method
		d.area(12,50); // two parameter method
		d.area((float)12.5); // float type method

	}

}
