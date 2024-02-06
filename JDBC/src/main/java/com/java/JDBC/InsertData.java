package com.java.JDBC;

import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	public static String insertStudent() throws SQLException {
		String sql = "insert into student(studentName,courseEnrolled) values('Likhith','Python')";
		Statement stmt = JDBCConnection.getConnection().createStatement();
		int i = stmt.executeUpdate(sql);
		if(i>0) {
			return "Data added successfully";
		}
		return "Something went wrong";
	}

	public static void main(String[] args) throws SQLException {
		System.out.println(insertStudent());
	}

}
