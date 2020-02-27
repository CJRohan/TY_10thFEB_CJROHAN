package com.ty.threads;

public class PrintingMethodClass1 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Printing Value: " + i);			
		}
	}
	
	public static synchronized void printingValues2() {
		for (int i = 1; i < 10; i++) {
			System.err.println("Printing Value: " + i);			
		}
	}

}
