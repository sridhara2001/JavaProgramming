package com.stringBuffer;

public class Test2 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()); // Default capacity of String Buffer is 16
		
		sb.append("abcdefghijklmnopqr");
		System.out.println(sb.capacity());
		
		StringBuffer sb2 = new StringBuffer(30); // Passing the capacity value
		System.out.println(sb2.capacity());
	}

}
