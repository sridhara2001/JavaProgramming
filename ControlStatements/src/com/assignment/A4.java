package com.assignment;

import java.util.Scanner;

class sumOfNum{
	int sum=0;
	
	public sumOfNum(int n) {
		for(int i=1; i<=n; i++) {
			sum = sum+i;
		}
	}
	
	public void showResult() {
		System.out.println(sum);
	}
}
public class A4 {
	

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sumOfNum s = new sumOfNum(num);
		s.showResult();

	}

}
