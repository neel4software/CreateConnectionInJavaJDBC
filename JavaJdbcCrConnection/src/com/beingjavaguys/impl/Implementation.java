package com.beingjavaguys.impl;

import com.beingjavaguys.jdbc.CreateConnection;

public class Implementation {
	public static void main(String args[]) {

		// create connection in JDBC
		CreateConnection createConnection = new CreateConnection();
		if ((createConnection.getConnection("checkJDBC", "root", "root") != null)) {
			System.out.println("Connection Created Successfully !");
		}

	}
}
