package com.abstraction;

interface A{
//	void m1();
}

interface C{
//	void m3();
}

interface B extends A,C{
//	void m2();
}

// A class can implements any number of interfaces
class Imp1 implements A,B,C{
	
}

public class Interfaces2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
