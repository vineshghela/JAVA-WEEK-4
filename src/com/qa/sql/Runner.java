package com.qa.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Runner {
	// JDBC driver and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.driver";
	static final String DB_URL = "jdbc:mysql://localhost/ims";
//	static final String DB_URL = "jdbc:mysql://127.0.0.1/software1";

//	DB username and password 
	static final String USER = "root";
	static final String PASS = "root";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		// Registering our JDBC Driver
		try {
			Class.forName("com.mysql.jdbc.Driver");

			// open a connection
			System.out.println("connection is being opened");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// Create our Create statement
			System.out.println("Creating our create statment");
			stmt = conn.createStatement();
			String sql;
			String a = "beans";
			String b = "tom";
			sql = "INSERT INTO customers (`first_name`, `surname`) VALUES ( " + a + ", 'paw');";
			stmt.execute(sql);
			sql = "INSERT INTO customers (`first_name`, `surname`) VALUES ( 'sam', 'smith');";
			stmt.execute(sql);

			// Create our delete statement
			System.out.println("Creating our delete statment");
			stmt = conn.createStatement();
			int delId = 1;
			sql = "DELETE FROM customers where id=" + delId + ";";
//			sql = "DELETE FROM customers where id=1;";

			stmt.execute(sql);
			sql = "DELETE FROM customers where id=2;";
			stmt.execute(sql);

			// Create our read statement
			System.out.println("Creating our read statment");
			stmt = conn.createStatement();
//		
			sql = "SELECT id,first_name,surname FROM customers;";
			ResultSet rs = stmt.executeQuery(sql);

			// Iterate over the object and get EACH record out
			while (rs.next()) {
				int id = rs.getInt("id");
				String fName = rs.getString("first_name");
				String sName = rs.getString("surname");

				System.out.println("The id: " + id + " First name: " + fName + "Second name: " + sName);
			}

			rs.close();
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		System.out.println("Keep doing more stuff");
//		int num;
//		try {
//			Scanner sc = new Scanner(System.in);
//			num = sc.nextInt();
//			System.out.println(num);
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("An error occured " + e);
//		} finally {
//			System.out.println("I happened regardless of before");
//		}
//
//		System.out.println("helpppp");

	}

}
