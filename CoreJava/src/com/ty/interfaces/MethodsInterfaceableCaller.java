package com.ty.interfaces;

public class MethodsInterfaceableCaller {//implements MethodsInterfaceable{
	
	public static void main(String[] args) {
		MethodsInterfaceable methodsInterfaceable = new ImplementingInterface() {
		};
		System.out.println(methodsInterfaceable);
		methodsInterfaceable.display();
	}

}
