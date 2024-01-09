package com.access_modifier_2;

import com.access_modifier.Student;

public class Test {

	public static void main(String[] args) {
		Student obj = new Student();
	//	System.out.println(obj.data); // Can't access default data through another package
		System.out.println(obj.data2); // Can access public data through another package
	//	System.out.println(obj.data3); // Can't access private data through another package
		System.out.println(obj.getData3()); // Can access private through function in another package
	//	System.out.println(obj.data4); // Can't access protected through another package
		
		System.out.println("------");
		EC obj1 = new EC();
		//	System.out.println(obj1.data); // Can't access default data through another package
			System.out.println(obj1.data2); // Can access public data through another package
		//	System.out.println(obj1.data3); // Can't access private data through another package
			System.out.println(obj1.getData3()); // Can access private through function in another package
		//	System.out.println(obj1.data4); // Can't access protected through another package

	}

}
