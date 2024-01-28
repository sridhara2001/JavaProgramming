package com.practice;

import java.util.HashMap;
import java.util.Map;

// The First Non-repeating number in an array using HashMap 
public class Test7 {
	public static void nonRepeat(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int data:arr) {
			if(map.containsKey(data)) {
				map.put(data, map.get(data)+1);
			}else {
				map.put(data, map.getOrDefault(data, 1));
			}
		}		System.out.println(map);
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println("The first non-repeating number is "+entry.getKey());
				return;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,1,3,2,4,5};
		nonRepeat(arr);

	}

}
