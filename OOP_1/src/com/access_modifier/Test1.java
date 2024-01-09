package com.access_modifier;

public class Test1 {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.data); // Can access default data within same package
		System.out.println(s1.data2); // Can access public data within same package
	//	System.out.println(s1.data3); // Can't access private data within same package
		System.out.println(s1.getData3()); // Can access private data through calling functions only
		System.out.println(s1.data4); // Can access protected data within same package
		
		System.out.println("Child Class Object");
		CSE obj = new CSE();
		System.out.println(obj.data); // Can access default data through child class within same package
		System.out.println(obj.data2); // Can access public data through child class within same package
	//  System.out.println(obj.data3); // Can't access private data through child class also Becoz it can be accessible through functions only
		System.out.println(obj.data4); // Can access protected data through child class within same package
		
		employee obj1 = new employee();
	//	System.out.println(obj1.data); // Can't access default data in one class through another class within same package
	//	System.out.println(obj1.data2); // Can't access public data in one class through another class within same package
    //	System.out.println(obj1.data3); // Can't access private data in one class through another class within same package
	//	System.out.println(obj1.data4); // Can't access protected data in one class through another class within same package
		
	}

}
