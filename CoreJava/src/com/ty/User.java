package com.ty;

public class User {
	
	private String username;

    @Override
    public String toString() {
    	return super.toString();
    }
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public static void main(String[] args) {
		int i = 20;
		Object o = 25;
		
		System.out.println(o);
		o = i;
		System.out.println(o);
	}

}
