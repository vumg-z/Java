package com.app.fmmvc;
import org.junit.Test; 
import java.sql.Connection;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TestDatabaseConection {
	
	@Test
	public void testConecction() {
		Connection connection = DataBaseUtil.getConnection();
		assertNotNull("No se realizo la conexion", connection);
		try {
			connection.close();
			assertTrue("no se cerro la conexion",connection.isClosed());
		}catch(Exception e) {
			
		}
	}
}
