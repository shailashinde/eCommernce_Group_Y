package admin;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
	
	Connection connection= null;
	// connection method
	public Connection getConnectionDemo() {
		try {
		// load the Driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//establish the connection
		 connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/e-commerce", "root", "Backspace@123");
		 										
		}catch (Exception e) {
			// TODO: handle exception
		}
		return connection;
	}
}
