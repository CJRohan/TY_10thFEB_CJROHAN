package com.oca;

class Reindeer extends Deer {

	public Reindeer(int age) {
		System.out.print("Reindeer");
	}
    
	@Override
	public boolean hasHorns() {
		return true;
	}

	public static void main(String[] args) {
		Reindeer deer = new Reindeer(5);
		System.out.println("," + deer.hasHorns());
	}
	
}
