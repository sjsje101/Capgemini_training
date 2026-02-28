package com.capg.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class PlayerRepository {

	public static Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:oracle:thin:@myhost:1521:", null, null)
		}
		return null;
		
	}
}
