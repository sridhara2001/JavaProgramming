package com.polymorphism;

class Parent{
	int data =100;
	public void m1() {
		System.out.println("m1() from parent class");
	}
}
class Child extends Parent{
	int data =200;
	@Override
	public void m1() {
		System.out.println("m1() from child class");
	}
}

public class DynamicDispatch {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
		System.out.println(p.data);
		
		Child c = new Child();
		c.m1();
		System.out.println(c.data);
		
		Parent p1 = new Child(); // dynamic dispatch
		p1.m1();
		System.out.println(p1.data);

	}

}
