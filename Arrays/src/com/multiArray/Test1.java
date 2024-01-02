package com.multiArray;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// Creating 2-D Array
		int [][] arr = {{1,2,3}, {11,12,13}, {21,22,23}}; // 1st Way of creating 2-d array
		System.out.println(arr.length); // It gives no. of rows
		
		// User Input // 2nd way of creating 2-d array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of rows");
		int rows = sc.nextInt();
		
		System.out.println("Enter the Number of cols");
		int cols = sc.nextInt();
		
		int [][] arr1 = new int[rows][cols];
		System.out.println("Enter the elements");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("------------");
		System.out.println("Displaying Elements");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("-------");
		System.out.println("Jagged Array");
		int[][] arr2= {{},{},{}};
		
		System.out.println("------------");
		System.out.println("Displaying Elements");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
