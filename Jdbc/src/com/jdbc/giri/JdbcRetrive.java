package com.jdbc.giri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcRetrive {
	static Connection con;
	static Statement st;
	static String url = "jdbc:mysql://localhost:3306/girish";
	static String usr = "root";
	static String pwd = "Year@2021";
	static String sql = "select * from user ";

	public static void main(String[] args) throws SQLException, Exception {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url, usr, pwd);
		st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		String uname;
		int uid;
	
			while (rs.next()) {
				uid = rs.getInt("userId");
				uname = rs.getString("userName");
				System.out.println("userid : " + uid);
				System.out.println("userName : " + uname);
			}
		

	}

}
