package com.frasesmatonasjdbc.model;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import org.junit.Test;



public class TestDatabaseConnection {

	@Test
	public void testConnection() {
		Connection connection = DatabaseUtil.getConnection();
		assertNotNull("No se realizó la conección", connection);
		
		try {
			
			connection.close();
			assertTrue("no se cerró la conneccion",	connection.isClosed());
		} catch (Exception e) {

			
		}
	}
}
