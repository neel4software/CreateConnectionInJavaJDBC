package com.beingjavaguys.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class CreateConnection {

	// defining driver name, mysql-jdbc driver in this case
	String driverName = "com.mysql.jdbc.Driver";
	Connection con = null;

	// database url string with hostname and port on which db is running
	String url = "jdbc:mysql://localhost:3306/";

	public Connection getConnection(String dbName, String username,
			String password) {

		// creating connection url
		String connectionUrl = url + dbName;

		try {
			// registers the specified driver class into memory
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			// returns a connection objcet by selecting an appropriate driver
			// for specified connection URL
			con = DriverManager
					.getConnection(connectionUrl, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
