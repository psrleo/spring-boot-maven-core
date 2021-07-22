package com.corejavaeight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");

		//java | python | nodejs | ruby

		String result = list.stream().map(x -> x).collect(Collectors.joining(" | "));
		
		System.out.println(result); //OUTPUT java | python | nodejs | ruby


	}

}
