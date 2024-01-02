package com.arrays;

// Largest Number in Array
public class Problem6 {
	public static int largestNum(int[] arr) {
		int large=0;
		for(int i=0; i<arr.length; i++) {
			int n1=arr[i];
			if(large>n1) {
				large=large;
			}else {
				large=n1;
			}
		}
		return large;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,7,6,4,12,9,5,8,10};
		int result = Problem6.largestNum(arr);
		System.out.println("The Largest Number is "+result);

	}

}
