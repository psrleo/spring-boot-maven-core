package com.corejavaeight;


//In JAVA 1.5
//
//String password="password123";
//
//char[]passwordInCharArray=password.toCharArray();
//
//for(char temp:passwordInCharArray){
//
//System.out.println(temp);
//
//}

//Same above code in Java 8
public class StringToCharArray {

	public static void main(String[] args) {

		String password = "password123";

		password.chars() // IntStream

				.mapToObj(x -> (char) x)// Stream<Character>

				.forEach(System.out::println);
		

	}

}
