package com.corejavaeight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import org.slf4j.LoggerFactory;

public class ArrayExample2 {
	
	private static org.slf4j.Logger logger = LoggerFactory.getLogger(ArrayExample2.class);
	public static void main(String[] args) {

		int[] number = { 3, 4, 5, 6, 7, 8, 9, 10 };

		// IntStream.of or Arrays.stream, same output

		// List<Integer> list =
		// IntStream.of(number).boxed().collect(Collectors.toList());

		List<Integer> list = Arrays.stream(number).boxed().collect(Collectors.toList());
		list.forEach(System.out::println);
		logger.info("Printing the list of items ="+list);
//		logger.warn("Printing the list of items ="+list);
//		logger.debug("Printing the list of items ="+list);
		System.out.println("list : " + list);
		
		OptionalInt min = Arrays.stream(number).min();
		System.out.println("Printing minimum value from the arrau"+min);
		
		
		int sum = Arrays.stream(new int[]{1, 2, 3})
				  .filter(i -> i >= 2)
				  .map(i -> i * 3)
				  .sum();
		
		System.out.println("sum ="+sum);

	}
}
