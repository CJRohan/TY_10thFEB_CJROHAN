package com.ty;

public class PrintAreas {
	public static void main(String[] args) {
		AreaCalculator obj=new AreaCalculator();	
		System.out.println("Area of Rectange: "+obj.calcAreaOfRectangle(10, 20));
		System.out.println("Area of Square: "+obj.calcAreaOfSquare(50));
		System.out.println("Area of Circle: "+obj.calcAreaOfCircle(15));
	}

}
