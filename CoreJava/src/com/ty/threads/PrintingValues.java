package com.ty.threads;

public class PrintingValues {
	
	public static synchronized void main(String[] args) {
		System.out.println("main(-) starts");
		
		Thread t1 = new PrintingMethodClass1();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Thread t2 = new Thread(new PrintingMethodClass2());
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main(-) ends");
	}
}
