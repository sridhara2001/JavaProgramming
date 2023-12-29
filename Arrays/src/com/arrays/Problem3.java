package com.arrays;

import java.util.Scanner;

// Printing the index of an element in array
public class Problem3 {
	public static int indexNumber(int[] arr, int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]== key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {10,21,32,11,19,20};
		System.out.println("Enter the Element");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int result = Problem3.indexNumber(arr, k);
		System.out.println(result);

	}

}
