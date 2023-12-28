package com.assignment;

import java.util.Scanner;

public class A3 {
	public static void largestNumber(int num1, int num2) {
		if(num1>num2) {
			System.out.println(num1+" is Greater than "+num2);
		}else {
			System.out.println(num2+" is Greater than "+num1);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter your Numbers");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		A3.largestNumber(n1, n2);

	}

}
