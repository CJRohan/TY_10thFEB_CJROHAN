package com.ty.stringsco;

public class StringBufferExample {
	
	public static void main(String[] args) {
		
		StringBuffer stringBuffer = new StringBuffer("Some String Buffered");
		
		System.out.println(stringBuffer.getClass());
		
		stringBuffer.append("66845165.0598514544"); 
		System.out.println(stringBuffer);
		
		System.out.println(stringBuffer.length());	
		System.out.println(stringBuffer.capacity());
		
		stringBuffer.reverse();
		System.out.println(stringBuffer);
		stringBuffer.reverse();
		
		stringBuffer.replace(0, 3, "s");
		System.out.println(stringBuffer);
		
		stringBuffer.insert(2, "Hi");
		System.out.println(stringBuffer);
		
		System.out.println(stringBuffer.indexOf(""));
		System.out.println(stringBuffer.lastIndexOf(""));
		
	}
	
}
