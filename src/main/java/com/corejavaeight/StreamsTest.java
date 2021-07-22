package com.corejavaeight;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listr = Arrays.asList("aaa"," ","bbb", "ccc", " ", "aaa", "bbb");
		
		List<String> liFiltered = listr.stream().filter(String->!String.isEmpty()).collect(Collectors.toList());			
				System.out.println(liFiltered);
				
				// 1
				String liFilteredStr = listr.stream().filter(String->!String.isEmpty()).collect(Collectors.joining(","));			
				System.out.println(liFilteredStr);
				
				
				// 2
				Long l = listr.stream().filter(String->!String.isEmpty()).count();
				System.out.println(l);
				
				// 3
				Long l2 = listr.stream().filter(String -> String.length() == 3).count();
				System.out.println(l2);
				
				
				// 4
				 List<String> items = Arrays.asList("apple", "apple", "banana",
			                        "apple", "orange", "banana", "papaya");

			        Map<String, Long> result = items.stream().collect( Collectors.groupingBy( Function.identity(), Collectors.counting()
			                        )
			                );
			        
			        System.out.println("result ="+result);
			        
			        Map<String, Long> finalMap = new LinkedHashMap<>();
			        
			        result.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue()
	                        .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

	        System.out.println(finalMap);
	        
	        //5
	        Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");

//	        language.collect(Collectors.toList()).forEach(System.out::println);
	        
	        language.filter(x->x!=null).collect(Collectors.toList()).forEach(System.out::println);
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        //6
	        
  //	        List<Integer> ages1 = Arrays.asList(34,45,65,23,56,87,12);

	       
	        List<Employee> ages = Arrays.asList(new Employee("name1", 23), new Employee("name2", 44), 
	        		new Employee("name3", 12), new Employee("name4", 34), new Employee("name5", 76));
	        
	        ages.sort((Employee age1, Employee age2)-> age1.getAge() - age2.getAge());
	        ages.forEach((age)->System.out.println(age.getAge()));
	        
			        
			       


	}

}
