package com.assignment;

public class A5 {
	public static boolean isPrime(int num) {
		boolean flag = true;
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		int num = 17;
		boolean result = A5.isPrime(num);
		if(result) {
			System.out.println(num+" is prime number");
		}else {
			System.out.println(num+" is not prime number");
		}

	}

}
