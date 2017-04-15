package com.inventory.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
@WebServlet("/controller")
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action=request.getParameter("action");
		try
		{
			
			
		if(action.compareTo("Ragister")==0)
		{
			try{
			int uid=Integer.parseInt(request.getParameter("uid"));
			String fname=request.getParameter("fname");

			String lname=request.getParameter("lname");
			long mno=Long.parseLong(request.getParameter("mno"));
			String uname=request.getParameter("reg_uname");
			String pass=request.getParameter("reg_pass");
			
//session
			
			
			
			Customer c=new Customer(uid,fname,lname,mno,uname,pass);
			customerDAO temp=new customerDAO();
			temp.insertUser(c);
			
			
			
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			response.sendRedirect("/InventoryManagmentGopal/user.jsp");
			
			}
		else if(action.compareTo("Login")==0)
		{
			String uname=request.getParameter("uname");
			String pass=request.getParameter("pass");
			customerDAO temp=new customerDAO();
			
			boolean gp=temp.validate(uname,pass);
			if(gp==false)
			{
				response.sendRedirect("login.jsp");
			}
			else
			{
				response.sendRedirect("user.jsp");
			}
		}
		else if(action.compareTo("SignUp")==0)
		{
			response.sendRedirect("ragistrection.jsp");
		}
		
		
		else if(action.equals("add_item"))
		{
		
				int icode=Integer.parseInt(request.getParameter("icode"));
				String ides=request.getParameter("ides");
				int istock=Integer.parseInt(request.getParameter("istock"));
				int mstock=Integer.parseInt(request.getParameter("Mstock"));
				int cost=Integer.parseInt(request.getParameter("cost"));
				int cat=Integer.parseInt(request.getParameter("cat"));
			
				item i1=new item(icode,ides,istock,mstock,cost,cat);
				InventoryItemDAO d1=new InventoryItemDAO();
				d1.insertitem(i1);
				
			response.sendRedirect("/InventoryManagmentGopal/view.jsp");
		}
		else if(action.compareTo("catadd")==0)
		{
			try{
			int cid=Integer.parseInt(request.getParameter("cid"));
			String cname=request.getParameter("cname");
			
			category c1=new category(cid, cname);
			InventoryItemDAO id=new InventoryItemDAO();
			id.insertcat(c1);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		else if(action.compareTo("show all item")==0)
		{
			InventoryItemDAO temp=new InventoryItemDAO();
			item t[]=temp.viewitem();
			request.setAttribute("item2",t);
			request.getRequestDispatcher("view.jsp").forward(request, response);
		}
		
		else if(action.compareTo("update item")==0)
		{
			int icode=Integer.parseInt(request.getParameter("icode"));
			String ides=request.getParameter("ides");
			int istock=Integer.parseInt(request.getParameter("istock"));
			int mstock=Integer.parseInt(request.getParameter("Mstock"));
			int cost=Integer.parseInt(request.getParameter("cost"));
			int cat=Integer.parseInt(request.getParameter("cat"));
		
		item i1=new item(icode,ides,istock,mstock,cost,cat);
		InventoryItemDAO d1=new InventoryItemDAO();
		d1.updateitem(i1);
			
		}
		
		//fetch item code
		else if(action.compareTo("delete item")==0)
		{
			InventoryItemDAO id=new InventoryItemDAO();
			int arr[]=id.deleteitem();
			request.setAttribute("icode2", arr);
			request.getRequestDispatcher("delete.jsp").forward(request, response);;
		}
		//delete single item
		else if(action.compareTo("delete")==0)
		{
			//combo box name in get parameter
			int gp=Integer.parseInt(request.getParameter("Item_code"));
			InventoryItemDAO id=new InventoryItemDAO();
			id.delete_item(gp);
		}
		//delete multimle item
		else if(action.compareTo("multi_delete")==0)
		{
			InventoryItemDAO id=new InventoryItemDAO();
			int arr[]=id.deleteitem();
			for(int i=0;i<arr.length;i++)
			{
				int temp=Integer.valueOf(request.getParameter(String.valueOf(arr[i])));
				if(arr[i]==temp)
				{
					
						id.delete_item(temp);
				}		
				
				
			}
		}
	/*	else
		{
			int icode=Integer.parseInt("action");
			InventoryItemDAO temp=new InventoryItemDAO();
			item item=temp.serch(icode);
			cart c1=new cart(item.getIcode(),item.getIdes(),1,item.getCost());
			
			cartDAO cd=new cartDAO();
			String usn=(String)session.getAttribute("username");
			cd.insertcart(c1, usn);
			
					
		}
	*/	
		
		
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	

}
