package com.corejavaeight;

public interface Printabe {
	
	public void print();
	
	default void printForm() {
		System.out.println("Printing a Copy");
	}
}
