package com.if_else;

import java.util.Scanner;

public class Test_1 {
	public void isPositive(int num) {
		if(num>0) {
			System.out.println(num+" is a positive number");
		} else {
			System.out.println(num+" is a negative number");
		}
	}
	public void isEven(int num1) {
		if(num1%2==0) {
			System.out.println(num1+" is a even number");
		} else {
			System.out.println(num1+" is a odd number");
		}
	}
	public boolean iseven(int num) {
		if(num%2==0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Test_1 t = new Test_1();
		t.isPositive(12);
		t.isPositive(-12);
		
		Test_1 t1 = new Test_1();
		t1.isEven(456);
		t1.isEven(327);
		
		int data = 14;
		boolean result = t.iseven(data);
		if (result) {
			System.out.println(data+" is an even number");
		} else {
			System.out.println(data+" is an odd number");
		}
		System.out.println("----------");
		System.out.println("User Input");
		System.out.println("Enter any Number:");
		Scanner sc = new Scanner(System.in);
		int userData = sc.nextInt();
		boolean result2 = t.iseven(userData);
		if (result2) {
			System.out.println(userData+" is an even number");
		} else {
			System.out.println(userData+" is an odd number");
		}
	}

}
