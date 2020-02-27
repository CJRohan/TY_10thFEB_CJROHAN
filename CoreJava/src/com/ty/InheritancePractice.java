package com.ty;


public class InheritancePractice extends Super{
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		InheritancePractice in=new InheritancePractice();
		in.A();
		InheritancePractice.A();
		
	}
	

}

class Super{
	
	static void A()
	{
		System.out.println("A");
	}
	
}