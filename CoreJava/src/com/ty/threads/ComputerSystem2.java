package com.ty.threads;

public class ComputerSystem2 extends Thread {

	PrintingApplication printingApplication;
	
	public ComputerSystem2(PrintingApplication printingApplication) {
		this.printingApplication = printingApplication;		
	}

	@Override
	public void run() {
		System.err.println(">>>> Printing from ComputerSystem2...");
		printingApplication.printingDocuments("Documents from ComputerSystem2", 10);
		System.err.println("Finished Printing from ComputerSystem2...");
	}
	
}
