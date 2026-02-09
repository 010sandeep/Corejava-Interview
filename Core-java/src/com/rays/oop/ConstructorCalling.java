package com.rays.oop;

public class ConstructorCalling {

	private String fName;
	private String lName;
	private String address;

	public ConstructorCalling(String fName, String lName,String address) {
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		

		System.out.println(fName +" "+ lName  +  " " + address);

	}

}
