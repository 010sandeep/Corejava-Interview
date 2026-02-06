package com.rays.oop;

public abstract class AbstractClass {

	private String name;

	public abstract void sum();

	public AbstractClass(String name) {
		this.name = name;
	}

	public static void sub() {
		System.out.println("sandeep");
	}
	
	public static void main(String[] args) {
		
		AbstractClass.sub();
		
		AbstractClass as = new AbstractClass("syam") {
			
			
			
			@Override
			public void sum() {
				System.out.println("sandeep");
				
			}
		};
		as.sum();
	}
}
