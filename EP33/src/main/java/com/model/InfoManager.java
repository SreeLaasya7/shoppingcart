package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class InfoManager 
{
	String url="jdbc:mysql://localhost:3306/ecommerce_cart";
	String un="root";
	String psw="root";
	Connection con=null;
	PreparedStatement ps=null;
	public List<InfoData1> Reading() throws Exception
	{
		con=DriverManager.getConnection(url,un,psw);
		ps=con.prepareStatement("select * from dealers");
		ResultSet rs=ps.executeQuery();
		List<InfoData1> L= new ArrayList<InfoData1>();
		while(rs.next())
		{
			InfoData1 S=new InfoData1();
			S.setName(rs.getString(1));
			S.setAddress(rs.getString(2));
			S.setPhoneno(rs.getInt(3));
			S.setProductname(rs.getString(4));
			
			L.add(S);
		}
		con.close();
		return L;
	}
		
	
}


