package product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertProduct {
		//e-commerce  product	pid	pname	 pdescription pprice 	pqty
	
	PreparedStatement ps = null;
	Connection con = null;
	
	
	//insert Product Method
	public void insertProduct(String pname,String pdescription,double pprice,int pqty) {
		try {
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
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter Product name >> "); 
			String pname = sc.nextLine(); 
			System.out.println("Enter product description >> "); 
			String pdescription = sc.nextLine();
			System.out.println("Enter product Price >> "); 
			double pprice = sc.nextDouble();
			System.out.println("Enter Product Quantity >> "); 
			int pqty = sc.nextInt();
			
			int pid=1;
			new Product(pid,pname, pdescription, pprice, pqty);
			//calling insertProduct() 
			InsertProduct iproudct = new InsertProduct();
			iproudct.insertProduct(pname, pdescription, pprice, pqty);
			
			
		}catch (Exception e) {
		e.printStackTrace();
		}finally {
			sc.close();
		}
	}
}
