package com.ty.threads;

public class PrintingMethodClass2 implements Runnable {

	@Override
	public synchronized void run() {
		for (int i = 1; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.err.println("Printing Value: " + i);			
		}
	}
}
