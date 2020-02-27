package com.ty.collections;

public class ArrayExample {
	
	public static void main(String[] args) {
		int size = 6;
		
		int[] intArray1 = new int[size];
		int[] intArray2 = {10, 20, 30, 40, 50, 60, 70, 80};
		
		int[] dA[] = new int[9][];
		dA[0] = new int[8];
	
		intArray1[0] = 1;
		intArray1[1] = 2;
		intArray1[2] = 3;
		intArray1[3] = 4;
		intArray1[4] = 5;
		intArray1[5] = 'a';
		for (int n : intArray1) {
			System.out.println(n);
		}
		for (int i = 0; i < intArray2.length; i++) {
			System.out.println(intArray2[i]);			
		}
	}
}

