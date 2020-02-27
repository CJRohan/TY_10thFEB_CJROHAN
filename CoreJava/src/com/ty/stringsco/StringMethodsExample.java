package com.ty.stringsco;

public class StringMethodsExample {
	
	public static void main(String[] args) {
	
		String string1="Some String";
		String string2="sOmE sTring";
		
		System.out.println("Length of string1 is "+string1.length());
		System.out.println(string1.isEmpty());
		System.out.println(string1.charAt(7));
		System.out.println(string1.equals(string2));
		System.out.println(string1.equalsIgnoreCase(string2));
		System.out.println(string1.concat(string2));
		System.out.println(string1.replace("S","X"));
		System.out.println(String.valueOf(6.05f)+5.66);//Converts any type of data into string
		System.out.println(string1.substring(0, 3));
		System.out.println(string1.startsWith("e", 3));
		System.out.println(string1.endsWith(""));
//		System.out.println((int)'a' + " - " + (int)'A');
		
	}

}