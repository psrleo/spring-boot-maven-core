package com.core;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class JoinArray {
	
	public static void main(String[] args)
	{
		String[] s1 = new String[] {"aaa","bbb","ccc"};
		
		String[] s2 = new String[] {"ddd","eee","fff"};
		
		int[] i1 = new int[] {1,2,3,5};
		
		int[] i2 = new int[] {6,7,8,9};
		
		String[] strAll = ArrayUtils.addAll(s1, s2);
		
		System.out.println("$$$$$$$$ "+strAll);
		
		Arrays.stream(strAll).forEach(System.out::println);
	}

}
