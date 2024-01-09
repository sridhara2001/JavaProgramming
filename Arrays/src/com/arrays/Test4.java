package com.arrays;

public class Test4 {

	public static void main(String[] args) {
		int[] arr = {1,5,10,25,15,20};
		int bigNum=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>bigNum) {
				bigNum=arr[i];
			}
		}
		System.out.println(bigNum);
	}

}
