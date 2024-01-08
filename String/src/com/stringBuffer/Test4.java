package com.stringBuffer;

public class Test4 {

	public static void main(String[] args) {
		String str = "Java";
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb.toString()); // Converting StringBuffer to String

	}

}
