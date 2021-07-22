package com.corejavaeight;

 
 public class FunctionalTestImplementer {
	 
	 
	 public static void main(String[] args) {
		 
		 
		 FunctionTest<Integer, String> tester2 = (i) -> i+"Apple";
		 System.out.println(tester2.apply(5));
		 
		 FunctionTest<Integer, Integer> tester = (i) -> i;
		 System.out.println(tester.apply(5));
				 
	 }
 }
