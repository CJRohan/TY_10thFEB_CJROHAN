package com.ty;

import java.io.FileNotFoundException;
import java.io.PrintStream;
//import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) throws FileNotFoundException {
		try (PrintStream p = new PrintStream("Hello Yo") ) {
			int i = 10;
			int j = 0000000015;//scn.nextInt()
//			if (j == 0)
//				System.err.println("Should not divide by zero... ");
//			else
				System.out.println(i / j);
		}
		System.out.println("Exiting through main(String[] args)... ");
	}	
}