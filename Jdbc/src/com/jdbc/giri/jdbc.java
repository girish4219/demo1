package com.jdbc.giri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc
{
static Connection con;
static Statement st;
static String url="jdbc:mysql://localhost:3306/girish";
static String usr="root";
static String pwd="Year@2021";
static String sql="insert into user values(6,'uday')";

	public static void main(String[] args) throws SQLException, Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url,usr,pwd);
		st = con.createStatement();
		int r =st.executeUpdate(sql);
		if(r ==1)
		{
			System.out.println("sucess");
		}
		else
		{
			System.out.println("unsucessfull");
		}
		
		
	
	}

}
