package com.ty;

/**
 * 
 * This class is for demonstrating
 * the handling of exception
 * 
 * @author C J Rohan
 *
 */
public class ExceptionExample extends Exception {

	/** I don't know what this is for..
	 *  Eclipse was prompting a warning to include this.
	 */
	private static final long serialVersionUID = 1L;

	
	ExceptionExample() {
		System.out.println("error through constructor");
	}

	
    public String getMessage() {
		return "Overrided getMessage()";
	}

    
	public static void main(String[] args)  {
		try {
			throw new ExceptionExample();
		} catch (Exception e) {
			e.printStackTrace();
			e = new ExceptionExample();
			System.out.println(e.getMessage());
     		e.printStackTrace();
		}
		
	}
	
}
