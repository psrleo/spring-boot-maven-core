package com.designpatterns;

public class ShapeFactoryTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory sf = new ShapeFactory();
		System.out.println("Area of Cirle for the given "+sf.getShape("Circle").getArea(3));
		
		System.out.println("Area of the Square ="+sf.getShape("Square").getArea(3));
		
	}
}
