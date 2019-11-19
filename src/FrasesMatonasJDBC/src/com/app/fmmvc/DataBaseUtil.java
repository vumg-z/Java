package com.app.fmmvc;
import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseUtil {
	
	private static final String URL_FORMAT = "jdbc:%s://%s:%s/%s" + 
			"?useUnicode=true"+
			"&useJDBCCompliantTimezoneShift=true"+
			"&useLegacyDatetimeCode=false"+
			"&serverTimezone=UTC";
	
	public static Connection getConnection() {

		String dbms = "mysql";
		String host = "localhost";
		String port = "3306";
		String databaseName = "frases_matonas";
		String user = "root";
		String password = "root";
		String url = String.format(URL_FORMAT,dbms,host,port,databaseName);

		Connection connection = null;
		
		//declaracion del driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url,user,password);
		}catch (Exception e) {
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
