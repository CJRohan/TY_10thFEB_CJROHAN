package com.ty.interfaces;

public class FunctionalInterfaceImpl implements FunctionalInterfaceExample, FunctionalInterfaceExample2 {
	
	@Override
	public void showMessage(int i)
	{
		System.out.println("Overriden showMessage() of FunctionalInterfaceExample"+i);
	}
	
	@Override
	public int add(int i, int k)
	{
		return i+k;
	}
	
	
	
	public static void main(String[] args) {
		FunctionalInterfaceImpl functionalInterfaceExample= new FunctionalInterfaceImpl();
		
		functionalInterfaceExample.showMessage(1);
		functionalInterfaceExample.displayMessage(1);
		functionalInterfaceExample.displayMessage();
		
		FunctionalInterfaceExample.printMessage();
	}

}
