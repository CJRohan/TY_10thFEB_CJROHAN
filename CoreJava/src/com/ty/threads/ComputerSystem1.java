package com.ty.threads;

public class ComputerSystem1 extends Thread {
	
	PrintingApplication printingApplication;
	
	public ComputerSystem1(PrintingApplication printingApplication) {
		this.printingApplication = printingApplication;		
	}

	@Override
	public void run() {
		System.err.println(">>>> Printing from ComputerSystem1...");
		
		printingApplication.printingDocuments("Documents from ComputerSystem1", 10);
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.err.println("Finished Printing from ComputerSystem1...");
	}
	
}
