package com.corejavaeight;

import java.util.Arrays;

//Convert String Array to List

//List<String>list=Arrays.asList(alphabet);
//
//if(list.contains("A")){
//
//System.out.println("Hello A");
//
//}

public class StringArrayContainsAlphabet {

	public static void main(String[] args) {

		String[] alphabet = new String[] { "A", "B", "C" };

		boolean result = Arrays.stream(alphabet).anyMatch("A"::equals);

		if (result) {

			System.out.println("Hello A");

		}
	}

}
