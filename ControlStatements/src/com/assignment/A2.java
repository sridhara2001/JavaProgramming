package com.assignment;

import java.util.Scanner;

public class A2 {
	public static void cubeOfNumber(int num) {
		int result = num*num*num;
		System.out.println("The cube of number "+num+" = "+result);
	}

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		A2.cubeOfNumber(n);

	}

}
