package com.ty.stringsco;

public class StringsExample {
	
	public static void main(String[] args) {
		
		String string1="Some String";
		
		String string2=new String("Some other String");
		
		String string3="Some other String";
		
		String string4="Some String";
		
		String string5=new String("Some other String");
		
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(string3);
		System.out.println(string4);
		System.out.println(string5);
		
		System.out.println(string1.hashCode());
		System.out.println(string2.hashCode());
		System.out.println(string3.hashCode());
		System.out.println(string4.hashCode());
		System.out.println(string5.hashCode());
		
		System.out.println("string1 == string4 : " + (string1 == string4));
		
		System.out.println("string2 == string3 : " + (string2 == string3));
		
		System.out.println("string2 == string5 : " + (string2 == string5));
		
//		System.out.println("string1 == string4 : " + string1==string4);
		
		
	}

}
