package com.inheritance;

class SuperClass{
	SuperClass(){
		System.out.println("SuperClass Object Created");
	}
}

class SubClass extends SuperClass{
	SubClass(){
		this(10);
//		super(10); // For parameterized constructor we have to call super keyword
		System.out.println("SubClass Object Created");
	}
	
//  Inside constructor we can't use super and this keyword both at the same time
//  We can use both keywords if the function is keyword
	SubClass(int b){
		// JVM automatically creates super keyword for default constructor if we didn't created
		super();
		System.out.println("SubClass Parameterized Object Created");
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		SubClass subClass = new SubClass();

	}

}
