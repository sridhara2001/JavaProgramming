package com.assignment;

import java.util.Scanner;

public class A1 {
	public static void mulOfNumber(int num) {
		for(int i=1; i<=10; i++) {
			int result = num * i;
			System.out.println(num+" * "+i +" = "+ result);
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		A1.mulOfNumber(n);

	}

}
