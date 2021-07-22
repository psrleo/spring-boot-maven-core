package com.corejavaeight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ForEachTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Iterating the items in java 8 using foreach
		List<String> items = Arrays.asList("apple", "ball", "cat", "doll");
		items.forEach(System.out::println);
		System.out.println();
		//Sorting the list items 		
		List<String> items2 = Arrays.asList("bbbb", "ggg", "hhhh", "aaaa");
		items2.sort(String.CASE_INSENSITIVE_ORDER);
		items2.forEach(System.out::println);
		
		System.out.println();
		
		items2.sort(Comparator.naturalOrder());
		items2.forEach(System.out::println);
		
	}
}
