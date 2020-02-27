package com.ty.collections;

public class CustomStringListExample {
	
	public static void main(String[] args) {
		
		CustomStringList customStringList = new CustomStringList();
		
		customStringList.add("A");
		customStringList.add("B");
		customStringList.add("C");
		customStringList.add("D");
		customStringList.add("E");
		customStringList.add("F");
		customStringList.add("G");
		customStringList.add("H");
		customStringList.add("I");
		customStringList.add("J");
		customStringList.add("K");
		customStringList.add("L");
		System.out.println("Size :" + customStringList.size());
		System.out.println(customStringList);
		System.out.println(customStringList.get(10));
		
		customStringList.add(1, "AA");
		System.out.println(customStringList);
		
		
	}

}
