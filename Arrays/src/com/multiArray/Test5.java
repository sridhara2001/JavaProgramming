package com.multiArray;

public class Test5 {

	public static void main(String[] args) {
		int[][] arr = {{21,24,20}, {26,18,30}, {19,23,10}};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				for(int k=i+1; k<arr.length; k++) {
					if(arr[i][j]>arr[k][j]) {
						int temp=arr[i][j];
						arr[i][j]=arr[k][j];
						arr[k][j]=temp;
					}
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
