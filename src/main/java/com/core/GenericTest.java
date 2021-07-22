package com.core;

class Test<T, U>
{
	T obj1;
	U obj2;
	
	public Test(T t1, U u1) {
		this.obj1= t1;
		this.obj2=u1;
	}
	
	public void print() {
		System.out.println(obj1 + " => "+obj2);
	}
}

public class GenericTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test<Integer, String> test = new Test<Integer, String>(45, "Test example");
		test.print();
		
		Test<String, String> test1 = new Test<String, String>("Apple", "Ball");
		test1.print();
		
		Test<Boolean, Boolean> tesBoo = new Test<Boolean, Boolean>(true, false);
		tesBoo.print();
		
	}
}
