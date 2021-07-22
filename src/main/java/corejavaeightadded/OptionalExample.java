package corejavaeightadded;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = new String[20];
		
		str[10] ="I'm good in java";
		
		Optional<String> op = Optional.ofNullable(str[10]);
		
		if(op.isPresent())
		{
			String str2 = str[10].toUpperCase();
			System.out.println(str2);
		}
		else {
			System.out.println("The given value is not present");
		}
		
		// >>>>>>>>>>> Check for the List is Present <<<<<<<<<<<<<
//		List<String> li = new ArrayList<>();
		List<String> li = null;
		
		Optional<List>  op2 = Optional.ofNullable(li);
		
		if(op2.isPresent()) {
			System.out.println("List is not null");
		}
		else {
			System.out.println("List is Null");
		}
	}
}
