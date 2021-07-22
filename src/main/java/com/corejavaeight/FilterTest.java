package com.corejavaeight;

import java.util.Arrays;
import java.util.List;

public class FilterTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> items = Arrays.asList("aaa", "", "nnnn", "", "aaa", "bbb"," ");
		
		long count = items.stream().filter(item->!item.isEmpty()).count();
		
		long l =items.parallelStream().filter(item->"aaa".equals(item)).count();
		System.out.println(count);
		System.out.println(l);
	}
}
