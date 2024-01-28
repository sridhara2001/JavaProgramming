package com.practice;

import java.util.HashMap;
import java.util.Map;

public class Test9 {
	public static void nonRepeatCharacter(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<str.length(); i++) {
			char data = str.charAt(i);
			if(map.containsKey(data)) {
				map.put(data, map.get(data)+1);
			}else {
				map.put(data, map.getOrDefault(data, 1));
			}
		}
		System.out.println(map);
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				return;
			}
		}
	}

	public static void main(String[] args) {
		String str = "abcdadrb";
		nonRepeatCharacter(str);

	}

}
