package product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertProduct {

	PreparedStatement ps = null;
	Connection con = null;
	String pname;
	String pdescription;
	double pprice;
	int pqty;
	
	//insert Product Method
	
	public void insertProduct() {	
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter Product name >> "); 
			 pname = sc.nextLine(); 
			System.out.println("Enter product description >> "); 
			 pdescription = sc.nextLine();
			System.out.println("Enter product Price >> "); 
			 pprice = sc.nextDouble();
			System.out.println("Enter Product Quantity >> "); 
			 pqty = sc.nextInt();
			
			int pid=1;
			new Product(pid,pname, pdescription, pprice, pqty);
			 
			//create object ConnectionTest Class
			ConnectionTest connectionTest = new ConnectionTest();
			con=connectionTest.getConnectionDemo();
		 
		 //create PrepareStatment
		 ps=con.prepareStatement("INSERT INTO product(pname,pdescription,pprice,pqty) VALUES(?,?,?,?) ");
		 ps.setString(1, pname);
		 ps.setString(2, pdescription);
		 ps.setDouble(3, pprice);
		 ps.setInt(4, pqty);
		 
		 int i=ps.executeUpdate();
		 System.out.println("Record is inserted successfully.." + i);		 
		}catch (Exception e) {
			e.printStackTrace();	
		}	 
	}
	}
