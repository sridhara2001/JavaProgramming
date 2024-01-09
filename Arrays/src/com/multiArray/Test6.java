package com.multiArray;

// Printing multi-dimensional array in Spiral format (Can be used for 3X3 and 3X4 Multidimensional array)
public class Test6 {

	public static void main(String[] args) {
		int[][] arr = {{11,12,13}, {21,22,23}, {31,32,33}};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
				if(j==arr[i].length-1) {
					for(int k=i+1; k<arr.length; k++) {
						System.out.print(arr[k][j]+" ");
						if(k==arr.length-1) {
							for(int m=arr[k].length-2; m>=0; m--) {
								System.out.print(arr[k][m]+" ");
								if(m==0) {
									for(int n=arr.length-2; n>=0; n--) {
										System.out.print(arr[n][m]+" ");
										if(n==1) {
											for(int p=1; p<arr[n].length-1; p++) {
												System.out.print(arr[n][p]+" ");
											}
											return;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

}
