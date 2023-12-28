package com.assignment;

import java.util.Scanner;

public class A6 {
	public static int sumOfDig(int num) {
		int sum = 0;
		while(num>0) {
			int rem = num%10;
			num = num/10;
			sum = sum+rem;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int result = A6.sumOfDig(num);
		System.out.println("Sum of Digits = "+result);

	}

}
