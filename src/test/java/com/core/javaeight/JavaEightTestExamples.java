package com.core.javaeight;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.entity.beans.Employee;


@SpringBootTest
public class JavaEightTestExamples {
	
	private static List<Employee> empList;
	
	@Test
	public void contextLoads() {
	}
	
	static {
		Employee[] arrayOfEmps = {
			    new Employee(1, "Jeff Bezos", 100000.0), 
			    new Employee(2, "Bill Gates", 200000.0), 
			    new Employee(3, "Mark Zuckerberg", 300000.0)
			};
		
		empList = Arrays.asList(arrayOfEmps);
		empList.stream();
	}
	
//	@Test
//	public void whenIncrementSalaryForEachEmployee_thenApplyNewSalary() {    
//	    empList.stream().forEach(e -> e.getSalary(10.0));
//	    
//	    assertThat(empList, contains(
//	      hasProperty("salary", equalTo(110000.0)),
//	      hasProperty("salary", equalTo(220000.0)),
//	      hasProperty("salary", equalTo(330000.0))
//	    ));
//	}
	
//	@Test
//	public void whenFilterEmployees_thenGetFilteredStream() {
//	    Integer[] empIds = { 1, 2, 3, 4 };
//	    
//	    List<Employee> employees = Stream.of(empIds)
//	      .map(employeeRepository::findById)
//	      .filter(e -> e != null)
//	      .filter(e -> e.getSalary() > 200000)
//	      .collect(Collectors.toList());
//	    
//	    assertEquals(Arrays.asList(arrayOfEmps[2]), employees);
//	}
//	
//	
//	@Test
//	public void whenFindFirst_thenGetFirstEmployeeInStream() {
//	    Integer[] empIds = { 1, 2, 3, 4 };
//	    
//	    Employee employee = Stream.of(empIds)
//	      .map(employeeRepository::findById)
//	      .filter(e -> e != null)
//	      .filter(e -> e.getSalary() > 100000)
//	      .findFirst()
//	      .orElse(null);
//	    
//	    assertEquals(employee.getSalary(), new Double(200000));
//	}
}
