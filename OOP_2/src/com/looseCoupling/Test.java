package com.looseCoupling;

public class Test {

	public static void main(String[] args) {
		Mobile mobile = new Mobile(new Jio());
		System.out.println(mobile.getNetwork());

	}

}
