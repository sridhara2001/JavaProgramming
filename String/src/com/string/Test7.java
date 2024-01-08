package com.string;

public class Test7 {
	public static void reverse(String str) {
		String str1 = "";
		String[] arr = str.split(" ");
		for(int i=arr.length-1; i>=0; i--) {
			str1 = str1+" "+arr[i];
		}
		System.out.println(str1);
	}

	public static void main(String[] args) {
		String str = "Java is a programming language"; // reverse it
		reverse(str);

	}

}
