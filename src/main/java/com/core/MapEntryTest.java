package com.core;

import java.util.HashMap;
import java.util.Map;

public class MapEntryTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> m = new HashMap<>();
		
		m.put("aa", "apple");
		m.put("bb", "ball");
		m.put("cc","cat");
		
		for(Map.Entry<String, String> entry : m.entrySet()){
			System.out.println(" Keys are ="+entry.getKey());
			System.out.println("Values are ="+entry.getValue());
		}
	}
}
