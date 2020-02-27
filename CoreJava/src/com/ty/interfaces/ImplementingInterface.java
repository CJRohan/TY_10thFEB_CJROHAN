package com.ty.interfaces;

public interface ImplementingInterface extends MethodsInterfaceable {
	default void display() {
		System.out.println("Implemented in ImplementingInterface");
	}
	
	
}	
	
