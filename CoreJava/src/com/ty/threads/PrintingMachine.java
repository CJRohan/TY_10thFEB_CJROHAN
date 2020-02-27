package com.ty.threads;

public class PrintingMachine {
	
	public static void main(String[] args) {
		System.err.println("PrintingMachine Started\n");
		
		PrintingApplication printingApplication = new PrintingApplication();
		Thread system1 = new ComputerSystem1(printingApplication);
		system1.setDaemon(true);
		system1.start();
		Thread system2 = new ComputerSystem2(printingApplication);
		system2.setDaemon(true);
		system2.start();
						
//		system1
    
		try {
			system1.join();
			system2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.err.println("\nPrintingMachine Stopped");
	}

}
