package com.frasesmatonasjdbc.jdbc;

import java.sql.Connection; //conection es una interfaz(define lo que se va a hacer pero no como lo hara)
import java.sql.DriverManager;

public class DatabaseUtil {

	private static final String URL_FORMAT = "jdbc:%s://%s:%s/%s?%s";

	public static Connection getConnection() {
		String dbms = "mysql";		//1
		String host = "localhost";	//2
		String port = "3306";		//3
		String databaseName = "frases_matonas"; 	//4
		String user = "root";		//5
		String password = "admin";		//6
		//añade los usos horarios utc a la url
		String timeZone = "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		
		//7
		String url = String.format(URL_FORMAT, dbms, host, port, databaseName, timeZone);

		
		//0driver DBMS
		//1 Encargado de conectar con la base de datos
		Connection connection = null;

		try {
			//creando instancia del driver en memoria
			//para poder ser accedida
			Class.forName("com.mysql.jdbc.Driver");
			
			//obtener la conexion a la base de datos
			connection = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {

			e.printStackTrace();

		}

		return connection;
	}

	public static void closeConnection(Connection conn) {
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
