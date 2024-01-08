package com.stringBuffer;

public class Test1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); // Creating String Buffer
		sb.append("Java");
		System.out.println(sb.hashCode()); // String Buffer Objects are mutable
		System.out.println(sb);
		sb.append("World..!");
		System.out.println(sb.hashCode());
		System.out.println(sb);
	}

}
