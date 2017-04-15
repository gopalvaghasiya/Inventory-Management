package com.inventory.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class cartDAO {


	Connection con;
	Statement s;
	ResultSet rs;

	public cartDAO() throws ClassNotFoundException, SQLException
	{
		Class.forName("org.postgresql.Driver");
		con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/InventoryDB","postgres","123");
	
	}
	
	public void insertcart(cart c,String uname) throws Exception
	{
		String sql="select * from cart where icode="+c.getIcode()+" and uname='"+uname+"';";
		s=con.createStatement();
		rs=s.executeQuery(sql);		
	
		if(rs.next())
		{
			throw new Exception("Item is already exist");
		}
		else
		{
			sql="insert into cart values("+c.getIcode()+",'"+c.getIdes()+"',"+c.getIqty()+","+c.getIrate()+",'"+uname+"')";
			s.executeUpdate(sql);
			sql="update item set istock=(select istock from item where icode="+c.getIcode()+")-1 where icode="+c.getIcode()+";";
			s.executeUpdate(sql);
		}
	}
	
	
	
	
}
