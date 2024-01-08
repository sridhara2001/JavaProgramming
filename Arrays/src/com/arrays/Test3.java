package com.arrays;

public class Test3 {

	public static void main(String[] args) {
		int[] arr = {1,2,5,4,10}; // Second Largest Number without sorting method
		int largeNumber=0;
		for(int i=0; i<arr.length; i++) {
			int num=arr[i];
			if(num>largeNumber) {
				largeNumber=num;
			}
		}
		int num1=0;
		int secondLarge=0;
		for(int i=0; i<arr.length; i++) {
			int num2 = arr[i];
			if(num2<largeNumber) {
				num1=num2;
				if(num1>secondLarge) {
					secondLarge=num1;
				}
			}
		}
		System.out.println(secondLarge);

	}

}
