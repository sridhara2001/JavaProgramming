package com.java.JDBC;

import java.sql.Connection;
import java.sql.Statement;

public class TableCreation {
	public static String createTable() {
		try {
			String sql = "create table student(studentId int(10) primary key auto_increment,"
					+" studentName varchar(10) not null, courseEnrolled varchar(20) not null)";
			Connection con = JDBCConnection.getConnection();
			if(con!=null) {
				Statement stmt = con.createStatement();
				stmt.execute(sql);
				return "Table Created Successfully";
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "Something Went Wrong";
	}

	public static void main(String[] args) {
		System.out.println(createTable());
	}

}
