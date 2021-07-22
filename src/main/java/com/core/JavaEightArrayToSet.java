package com.core;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaEightArrayToSet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = new String[] {"aaa","bbb","ccc", "aaa"};
		
		 Set<String> collect = Stream.of(arr).collect(Collectors.toSet());
		 
		 List<String> collect2 = Stream.of(arr).collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		System.out.println();
		collect2.forEach(System.out::println);
		
	}
	
}
