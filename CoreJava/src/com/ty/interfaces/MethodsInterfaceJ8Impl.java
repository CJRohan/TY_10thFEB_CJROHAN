package com.ty.interfaces;

public class MethodsInterfaceJ8Impl implements MethodsInterface{
	
	@Override
	public void displayMessage() {
		System.out.println("Overriden displayMessage() of MethodsInterface...");
	}
	
	@Override
	public void printMessage() {
		System.out.println("Overriden printMessage() of MethodsInterface... ");
	}
	
	@Override
	public void defaultMethodMessage() {
		System.out.println("Over finish khatam");
	}
	
	public static void main(String[] args) {
		MethodsInterface methodsInterface=new MethodsInterfaceJ8Impl();
		
		methodsInterface.displayMessage();
		methodsInterface.printMessage();
		methodsInterface.defaultMethodMessage();
		
		
		MethodsInterface.showMessage();
		
		
	}

}
