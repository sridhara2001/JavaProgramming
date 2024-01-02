package com.arrays;

import java.util.Scanner;

// Pair of a Number in an array
public class Problem5 {
	public static void pairOfNum(int[] arr, int key) {
		for(int i=0; i<arr.length; i++) {
			int n1 = arr[i];
			
			for(int j=i+1; j<arr.length; j++) {
				int n2 = arr[j];
				if(n1+n2==key) {
					System.out.println("The index value of pair of numbers of entered number is "+i+" and "+j);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,9,7,8,10,11,18,15};
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		Problem5.pairOfNum(arr, key);
		
	}

}
