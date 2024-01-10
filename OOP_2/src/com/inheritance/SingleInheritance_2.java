package com.inheritance;

class Base{
	private int data = 200;
	public int getData() {
		return this.data;
	}
}

class Derived extends Base{
	private int data2 = 300;
	public int getData() {
		return this.data2; // this keyword always refers to current class object
	}
	
	public int getResult() {
		return getData();
	}
	
	public int getResult2() {
		return super.getData(); // super keyword always refers to parent class object
	}
}

public class SingleInheritance_2 {

	public static void main(String[] args) {
		Derived derived = new Derived();
		System.out.println(derived.getResult()); // Output : 300
		System.out.println(derived.getResult2()); // Output : 200

	}

}
