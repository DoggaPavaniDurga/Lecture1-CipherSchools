package com.example.inventory;

public class Stock {
	//access from anywhere
	public String accesbleEverywhere;
	//access in this class
	private String accesblehere;
	//acess in subclass of stock,any class outside the package if the stock is inherited
	protected String  accesInDerivedClass;	
	String acesbleInsamePackage;
	

}
