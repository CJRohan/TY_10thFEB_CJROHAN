package com.ty.interfaces;

public interface MethodsInterface {
	
	public abstract void displayMessage();
	public void printMessage();
	
	public static void showMessage()
	{
		System.out.println("public static showMessage() of interface MethodsInterface... ");
	}
	
//	void notDefault()
//	{
//		System.out.println("notDefault()");
//	}

	
	default void defaultMethodMessage() 
	{
		System.out.println("defaultMethodMessage() of MethodsInterface... ");		
	}

}
