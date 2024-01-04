package com.string;

public class Test1 {

	public static void main(String[] args) {
		String str = "Java";
		String str1 = "Java";
		if(str==str1) {
			System.out.println("Points to same object");
		} else {
			System.out.println("Points to different object");
		}
		
		System.out.println(str.compareTo(str1));
		if(str.equals(str1)) {
			System.out.println("Contents are same");
		} else {
			System.out.println("Contents are different");
		}
		
	}

}
