package com.ty.threads.deadlock;

public class CustomThreadTester {
	
	public static void main(String[] args) {
		
		Object object1 = new Object();
		Object object2 = new Object();
		System.out.println(object1);
		System.out.println(object2);
		System.out.println();
		
		new CustomThread1(object1, object2).start();
		new CustomThread2(object1, object2).start();
		
	}
}
