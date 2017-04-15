package com.inventory.controller;

public class category {
	private int cid;
	private String cname;
	
	
	public category(int i,String n)
	{
		this.cid=i;
		this.cname=n;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}
	
	

}
