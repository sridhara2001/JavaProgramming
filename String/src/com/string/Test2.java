package com.string;

 // String classes are immutable(can't modify after creating)
public class Test2 {

	public static void main(String[] args) {
		String str = "Java";
		System.out.println(str);
		System.out.println(str.hashCode());
		
		str.concat("Code");
		System.out.println(str);
		
		str=str.concat("Code");
		System.out.println(str);
		System.out.println(str.hashCode());

	}

}
