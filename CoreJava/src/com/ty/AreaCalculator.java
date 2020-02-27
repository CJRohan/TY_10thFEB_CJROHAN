package com.ty;

public class AreaCalculator {

	public double calcAreaOfCircle(double radius) {
		return 3.1415 * radius * radius;
	}

	public int calcAreaOfRectangle(int heigth, int width) {
		return heigth * width;
	}

	public int calcAreaOfSquare(int side) {
		return side * side;// AreaOfRectangle(side,side)
	}
}
