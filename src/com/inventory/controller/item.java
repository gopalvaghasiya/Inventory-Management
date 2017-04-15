package com.inventory.controller;

public class item {

	private int icode;
	private String ides;
	private int istock;
	private int mstock;
	private int cost;
	private int cat;
	
	public item(int c,String id,int is,int ms,int co,int cat)
	{
		this.icode=c;
		this.ides=id;
		this.istock=is;
		this.mstock=ms;
		this.cost=co;
		this.cat=cat;
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

	public int getIstock() {
		return istock;
	}

	public void setIstock(int istock) {
		this.istock = istock;
	}

	public int getMstock() {
		return mstock;
	}

	public void setMstock(int mstock) {
		this.mstock = mstock;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getCat() {
		return cat;
	}

	public void setCat(int cat) {
		this.cat = cat;
	}
	
	
}
