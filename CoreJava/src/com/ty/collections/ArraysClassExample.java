package com.ty.collections;

import java.util.Arrays;

public class ArraysClassExample {
	
	public static void main(String[] args) {
		int[] intArray = {1, 23, 32, 965, 23, 23, 234, 123};
		Arrays.sort(intArray);
		System.out.println("Array 1 : ");
		for(int n : intArray) {
			System.out.println(n);
		}
		
		System.out.println("----------------");
		
		int[] intArray2 = Arrays.copyOf(intArray, 10);
		intArray2[8] = 333;
		intArray2[9] = 666;
		System.out.println("Array 2 (copy Array 1 and add 2 elements) using Arrays.copyOf(int[]) : ");
		for (int i : intArray2) {
			System.out.println(i);
		}
		
		System.out.println("----------------");

		Arrays.fill(intArray, 69);
		for (int i : intArray) {
			System.out.println(i);
		}

		System.out.println("----------------");

		Arrays.fill(intArray2, 6, 10, 69);
		for (int i : intArray2) {
			System.out.println(i);
		}
		
		int[] intArray3 = intArray;
		System.out.println(intArray3.equals(intArray));
		int[] intArray4 = Arrays.copyOf(intArray, intArray.length);
		System.out.println(intArray4.equals(intArray));
	}
}





















