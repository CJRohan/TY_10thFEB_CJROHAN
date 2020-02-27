package com.ty.threads.deadlock;

public class CustomThread2 extends Thread {

	Object object1;
	Object object2;

	public CustomThread2(Object object1, Object object2) {
		this.object1 = object1;
		this.object2 = object2;
	}

	@Override
	public void run() {
		synchronized (object2) {
			System.out.println(object2 + "   2");
			try {
				object2.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (object1) {
				System.out.println(object1 + "   2");
//				object1.notify();
			}			
		}
	}
}
