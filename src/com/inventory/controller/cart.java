package com.inventory.controller;

public class cart {

	private int icode;
	private String ides;
	private int iqty;
	private int irate;
	private String uname;
	
	public cart(int c,String d,int q,int r,String u)
	{
		this.icode=c;
		this.ides=d;
		this.iqty=q;
		this.irate=r;
		this.uname=u;
				
	}

	public int getIcode() {
		return icode;
	}

	public void setIcode(int icode) {
		this.icode = icode;
	}

	public String getIdes() {
		return ides;
	}

	public void setIdes(String ides) {
		this.ides = ides;
	}

	public int getIqty() {
		return iqty;
	}

	public void setIqty(int iqty) {
		this.iqty = iqty;
	}

	public int getIrate() {
		return irate;
	}

	public void setIrate(int irate) {
		this.irate = irate;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	
	
	
}
