package com.ty;

public class NoObject {
	static void demo() {
		NoObject n = new NoObject();
		System.out.println(n.toString());
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		demo();
	}
}
