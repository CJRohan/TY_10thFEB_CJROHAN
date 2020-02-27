package com.ty.interfaces;

@FunctionalInterface
public interface FunctionalInterfaceExample2 {
	
	public int add(int i, int j);

	default void displayMessage()
	{
		System.out.println("default displayMessage() of FunctionalInterfaceExample2");
	}
}
