package com.java.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
	private static final String driverClass="com.mysql.cj.jdbc.Driver";
	private static final String url="jdbc:mysql://localhost:3306/jdbc";
	private static final String userName = "root";
	private static final String password = "Sridhara@2001";
	
	public static Connection getConnection(){
		Connection con = null;
		try {
			Class.forName(driverClass);
			if(con==null) {
				con = DriverManager.getConnection(url, userName, password);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}

	public static void main(String[] args) {
		System.out.println(getConnection());
	}

}
