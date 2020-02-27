package com.ty.interfaces;
@SuppressWarnings("unused")
public class FunctionalInterfaceLambdaExample {

	static String string = "Lambda Expression Example for FunctionalInterfaceExample";
	static FunctionalInterfaceExample functionalInterfaceExample = (n) -> {
		System.out.println(string + n);
	};

	public static void main(String[] args) {
		
//		long i=9298575888l;
//		float f=6.0f;

		FunctionalInterfaceExample2 functionalInterfaceExample2 = (a, b) -> a + b;
//			System.out.println(string);
//			a+b; X
//          return a+b; /
//		};

		
		
		  functionalInterfaceExample.displayMessage(10);
		  functionalInterfaceExample.showMessage(5);
		  FunctionalInterfaceExample.printMessage();
		  
		  System.out.println(functionalInterfaceExample2.add(20, 26));
		  

	}

}
