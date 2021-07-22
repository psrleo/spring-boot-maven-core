package com.designpatterns;

public class ShapeFactory {
	
	private Shape shape;
	
	
	public Shape getShape(String str) {
		
		if(str.equals("Circle"))
		{
			 shape =new Circle();
			 return shape;
		}
		else if(str.equals("Square"))
		{
			shape = new Square();
			return shape;
		}
		
		return shape;
	}
}
