package com.arrays;

// Largest number in an array
public class Problem4 {
	public static int largestNum(int[] arr) {
		int n1;
		int n2;
		int large=0;
		for(int i=0; i<arr.length; i++) {
			n1=arr[i];
			
			for(int j=0; j<arr.length; j++) {
				n2=arr[j];
				if(n1>n2) {
					large=n1;
				}else {
					large=n2;
					break;
				}
			}
		}
		return large;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,7,6,4,9,5,8};
		int result = Problem4.largestNum(arr);
		System.out.println("The Largest Number is "+result);

	}

}
