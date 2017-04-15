package com.inventory.controller;

public class Customer {
// all varible are private and create get and set methos for each
	String fname,lname;
	int uid;
	String username,password;
	long mnumber;
	
	public Customer(int id,String fn,String ln,long n,String un,String p)
	{
		uid=id;
		fname=fn;
		lname=ln;
		mnumber=n;
		username=un;
		password=p;
		
	}
}
