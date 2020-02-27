package com.ty;

public class VarargsInputExample {
	
	public int add(int...is) {
		int sum = 0;
		for (int i : is) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		VarargsInputExample varargsInputExample = new VarargsInputExample();
		System.out.println("Sum : " + varargsInputExample.add(1,2,3,5,6,7,9));
	}

}
