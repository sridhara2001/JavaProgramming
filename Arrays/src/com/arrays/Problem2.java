package com.arrays;

// Sum of elements in an array
public class Problem2 {
	public static int sumOfElements(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int sum = Problem2.sumOfElements(arr);
		System.out.println("Sum of Elements in array is "+sum);
		
	}

}
