package com.multiArray;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("Enter the row and col");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i==row || j==col) {
					arr[i][j]=0;
				}
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
