package com.ty.interfaces;

@FunctionalInterface
public interface FunctionalInterfaceExample {
	
	void showMessage(int i);
	
	static void printMessage()
	{
		System.out.println("static printMessage() of FunctionalInterfaceExample");
	}
	
	default void displayMessage(int i)
	{
		System.out.println("default displayMessage() of FunctionalInterfaceExample"+i);
	}

}
