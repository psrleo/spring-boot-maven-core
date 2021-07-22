package com.corejavaeight;

import java.util.stream.IntStream;

public class IntStreamAnyMatch {
	
	public static void main(String[] args) {
		
		int[] number = new int[] {1, 4,5,7, 3, 9};
		
		boolean flag = IntStream.of(number).anyMatch(x->x==9);
		
		if(flag) {
			System.out.println("Number is available ");
			
		}
		else {
			System.out.println("Number is not available");
		}
	}

}
