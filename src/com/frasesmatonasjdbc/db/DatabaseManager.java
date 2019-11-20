package com.frasesmatonasjdbc.db;

import java.sql.Connection;

public class DatabaseManager {

	private Connection conn;
	
	public DatabaseManager(Connection conn)
	{
		this.conn=conn;
	}
	
}
