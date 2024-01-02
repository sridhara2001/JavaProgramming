package com.multiArray;

public class Test2 {

	public static void main(String[] args) {
		int sum=0;
		// Counting the number of zeros
		int[][] arr = {{11,0,0}, {0,21,22}, {0,0,0}};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				int ele = arr[i][j];
				if(ele==0) {
					sum=sum+1;
				}
			}
		}
		System.out.println(sum);
	}

}
