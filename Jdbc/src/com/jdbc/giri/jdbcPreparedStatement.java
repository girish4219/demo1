package com.jdbc.giri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcPreparedStatement {
	static Connection con;
	static PreparedStatement pst;
	static String url="jdbc:mysql://localhost:3306/girish";
	static String usr="root";
	static String pwd="Year@2021";
	static String sql="insert into user values(?,?)";

		public static void main(String[] args) throws SQLException, Exception 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter uid");
			int uid = sc.nextInt();
			System.out.println("enter uname");
			String uname = sc.next();
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,usr,pwd);
			pst = con.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setString(2, uname);
			int r = pst.executeUpdate();
			
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
