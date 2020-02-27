package com.ty.threads;

public class PrintingApplication {
	
	private int paper;
	
	public void addPaper(int n) {
		paper += n;
	}
	
	public void usePaper(int n) {
		if (paper > n)
			paper -= n;
	}
	
	public synchronized void printingDocuments(String document, int numOfCopies) {
		for (int i = 0; i < numOfCopies; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(">> Printing " + document + " #" + i);
		}
	}

}
