package com.inheritance;

class Parent{
	private int data = 200;
	public int parentClass() {
		return this.data;
	}
}

// Have to use extends keyword for Inheritance (parent-child) relationship
class Child extends Parent{
	private int data2 = 300;
	public int childClass() {
		return this.data2;
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Child obj = new Child();
		System.out.println(obj.parentClass());
		System.out.println(obj.childClass());
		
		System.out.println("------");
		
		Parent obj1 = new Parent();
		System.out.println(obj1.parentClass());
		
		// Parent class can't access the data of child class
	//	System.out.println(obj1.childClass());

	}

}
