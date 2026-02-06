package com.rays.oop;

public interface MakeInterface {
	

	public static final String NAME = "Sandeep Gurjar";
	
	public static final int NUM = 123;
	
	public int sum();
	
	
	public static void sub() { 
		System.out.println(NUM );
	}

	
	public default void add () {
		
		System.out.println(NAME );
	}
	
	public static void main(String[] args) {
		
		
		
		//Interface static method call
		MakeInterface.sub();
		
		// Interface attribute call
		System.out.println(MakeInterface.NAME);
		
		
		//default method call
		MakeInterface in = new MakeInterface() {
			
		
			
			@Override
			public int sum() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		in.add();
		
	}
	
}
