package com.inventory.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class InventoryItemDAO {

	Connection con;
	Statement s;
	ResultSet rs;
	
	public InventoryItemDAO() throws ClassNotFoundException, SQLException
	{
		Class.forName("org.postgresql.Driver");
		con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/InventoryDB","postgres","123");
	}
	
	public void insertitem(item i1) throws SQLException
	{
		String qur="insert into item values("+i1.getIcode()+",'"+i1.getIdes()+"',"+i1.getIstock()+","+i1.getMstock()+","+i1.getCost()+","+i1.getCat()+")";
		s=con.createStatement();
		s.executeQuery(qur);
		con.commit();		
	}
	
	public void insertcat(category c1) throws SQLException
	{
		String sql="insert into category values("+c1.getCid()+",'"+c1.getCname()+"')";
		s=con.createStatement();
		s.executeQuery(sql);
	}
	public item[] viewitem() throws SQLException
	{
		ArrayList<item> al=new ArrayList<item>();
		String sql="select * from item";
		s=con.createStatement();
		rs=s.executeQuery(sql);
		while(rs.next())
		{
			item i1=new item(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6));
			al.add(i1);
		}
	
		item arr[]=new item[al.size()];
		
		for(int i=0;i<al.size();i++)
		{
			arr[i]=al.get(i);
			
		}
		
		return arr;
		
		
	}
	
	public void updateitem(item i1) throws SQLException
	{
		String qur="update item set   idescription='"+i1.getIdes()+"', "
				+ "istock="+i1.getIstock()+",min_stock="+i1.getMstock()+", "
				+ "cost="+i1.getCost()+", category="+i1.getCat()+" "
				+ "where icode="+i1.getIcode()+";";
		s=con.createStatement();
		s.executeUpdate(qur);
	}
	
	public int[] deleteitem() throws SQLException
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		String sql="select icode from item";
		s=con.createStatement();
		rs=s.executeQuery(sql);
		while(rs.next())
		{
			int i1=rs.getInt(1);
			al.add(i1);
		}
		int arr[]=new int[al.size()];
		for(int i=0;i<al.size();i++)
		{
			arr[i]=al.get(i);
		}
		return arr;
	}
	
	public void delete_item(int gp) throws SQLException
	{
		String sql="delete from item where icode="+gp+";";
		s=con.createStatement();
		s.executeUpdate(sql);
	}
	

	public item serch(int icode) throws Exception
	{
		
		String sql="select * from item where icode="+icode+";";
		s=con.createStatement();
		rs=s.executeQuery(sql);
		item i1;
		if(rs.next())
		{
			 i1=new item(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6));
		}
		else
		{
			throw new Exception("item not exist");
		}
		return i1;
	}

	
	
}





