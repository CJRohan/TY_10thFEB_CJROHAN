package com.ty;

public class MethodDemo {
	/**
	 * This method adds two integers passed as arguments and returns the result
	 * @param i
	 * @param j
	 * @return i+j
	 */
	public static int add(int i, int j) {
		return i+j;	
	}
	public static void main(String[] args) {
			System.out.println(add(10,15));
			//return 10;
	}
}
