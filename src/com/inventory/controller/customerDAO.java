package com.inventory.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class customerDAO {

	Connection con;
	Statement s;
	ResultSet rs;
	
	 public customerDAO() throws SQLException, ClassNotFoundException
	{
		 Class.forName("org.postgresql.Driver");
		this.con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/InventoryDB","postgres","123");
	}
	
	public void insertUser(Customer c) throws SQLException
	{
		String qur="insert into ragistrection values("+c.uid+",'"+c.username+"','"+c.password+"','"+c.fname+"','"+c.lname+"',"+c.mnumber+");";
		s=con.createStatement();
		s.executeQuery(qur);
	}
	
	public boolean validate(String uname,String pass) throws SQLException
	{
		String qur="select * from ragistrection where uname='"+uname+"' and pass='"+pass+"';";
		s=con.createStatement();
		rs=s.executeQuery(qur);
		
		if(rs.next())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	
	}
	
	
	
	
}
