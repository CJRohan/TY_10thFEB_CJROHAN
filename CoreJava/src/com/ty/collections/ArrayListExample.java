package com.ty.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>(10);

		// add() 
		System.out.println("Size of ArrayList = " + arrayList.size());
		arrayList.add(10);
		arrayList.add(0, 15);
		arrayList.add(11);
		arrayList.add(12);
		arrayList.add(13);
		arrayList.add(14);
		arrayList.add(15);
		arrayList.add(16);
		
		System.out.println("Size of ArrayList = " + arrayList.size());
		
		//Different ways of printing
		System.out.println("\nPrinting the contents");
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
		System.out.println(arrayList);
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i)+" ");			
		}
		System.out.println("\n------------------");
		
		//Colections.sort(List<E>)
		Collections.sort(arrayList);
		System.out.println(arrayList);
		System.out.println("-------------------");
		
		//Colections.rotate(List<E>,int)
		Collections.rotate(arrayList, -1);
		System.out.println(arrayList);
		System.out.println("-------------------");
		
		//remove(int) , remove(Object)
		arrayList.remove(new Integer(10));		
		System.out.println("After removing data [10] : " + arrayList);
		arrayList.remove(0);
		System.out.println("After removing index [0] : " + arrayList);
		System.out.println("-------------------");
		
		//contains(Object)
		System.out.println("23 exists? - " + arrayList.contains(23));
		
	}

}
