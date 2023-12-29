package com.arrays;

import java.util.Scanner;

// Array is data structure in which arranging the data in an efficient way
// Array size cannot be changed during run-time
// At most time array contains homogeneous data type
public class Test1 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5}; // First way of creating an array
		
		int[] arr1 = new int[5]; // Second way of creating an array
		arr1[0]=21;
		arr1[1]=22;
		arr1[2]=23;
		arr1[3]=24;
		arr1[4]=25;
		
		Object[] arr2 = {1,1.2,"Hello"}; // Method to add heterogeneous data type

		// Accessing the array elements // Length is a predefined keyword
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
