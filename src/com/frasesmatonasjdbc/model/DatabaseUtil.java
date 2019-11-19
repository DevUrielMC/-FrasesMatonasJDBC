package com.frasesmatonasjdbc.model;
import java.sql.Connection; //conection es una interfaz(define lo que se va a hacer pero no como lo hara)
import java.sql.DriverManager;

public class DatabaseUtil {

	private static final String URL_FORMAT ="jdbc:%s://%s:%s/%s";
	
	
	public static Connection getConnection()
	{
		String dbms="mysql";
		String host="localhost";
		String port="3306";
		String databaseName="frases_matonas";
		String user="root";
		String password = "root";
		String url = String.format(URL_FORMAT,  dbms, host,port,databaseName);
		
		
		Connection connection= null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection= DriverManager.getConnection(url, user, password);
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		return connection;
	}
	
}
