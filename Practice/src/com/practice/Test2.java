package com.practice;

public class Test2 {
	public static void findSubarray(int[] arr, int sum) {
		for(int i=0; i<arr.length; i++) {
			int a1=arr[i];
			int sum1=0;
			for(int j=i+1; j<arr.length; j++) {
				int a2=arr[j];
				sum1=sum1+a2;
				int sum2=a1+sum1;
				if(sum2==sum) {
					System.out.println(i+" "+(j-1)+" "+j);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,4,20,3,10,5};
		int sum=18;
		findSubarray(arr, sum);

	}

}
