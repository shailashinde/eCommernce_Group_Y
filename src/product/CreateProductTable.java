package product;

import java.sql.Connection;
import java.sql.Statement;

public class CreateProductTable {
	
	Statement stmt = null;
	Connection con = null;
	
	
	public static void main(String[] args) {
		
		CreateProductTable c= new CreateProductTable();
		c.createTable();
		
	}
	//insert Product Method
	public void createTable() {
		try {
		//create object ConnectionTest Class
		ConnectionTest connectionTest = new ConnectionTest();
		
		//establish the connection	
		con=connectionTest.getConnectionDemo();
		 
		 //create eStatment
		Statement stmt=  con.createStatement();
		 		stmt.execute("CREATE TABLE product(pid INT NOT NULL AUTO_INCREMENT,pname VARCHAR(80) NOT NULL,pdescription LONGTEXT NOT NULL,pprice DOUBLE NOT NULL,pqty INT NOT NULL,PRIMARY KEY(pid))" );
		 System.out.println("Table Create successfully..");		 
		}catch (Exception e) {
			e.printStackTrace();	
		}	 
	
	}
}

