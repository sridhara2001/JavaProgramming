package com.arrays;

import java.util.Scanner;

// Pair of a Number in an array
public class Problem5 {
	public static void pairOfNum(int[] arr, int key) {
		int n1;
		int n2;
		for(int i=0; i<arr.length; i++) {
			n1 = arr[i];
			System.out.println(n1);
			
			for(int j=0; j<arr.length; j++) {
				n2 = arr[j];
				System.out.println(n2);
			}
		}
//		if(key=n1+n2) {
//			System.out.println(i);
//		}
	}

	public static void main(String[] args) {
		int[] arr = {1,9,7,8,10,11};
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		Problem5.pairOfNum(arr, key);

	}

}
