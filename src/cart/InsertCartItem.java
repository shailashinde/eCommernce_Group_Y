package cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import admin.Login;
import product.ConnectionTest;
import product.Product;

public class InsertCartItem {
		Connection con;
		PreparedStatement ps;
		int productid;
		String pname;
		String pdesc;
		double pprice;
		int productqty;
		int uid=1;
	
	public void insertcartItem() {	
		PreparedStatement ps;
		Connection con;
		ResultSet rs;
		
		
		Scanner sc= new Scanner(System.in);
		int choice;
		try {			
			List<Product> al= new ArrayList<>();		
			
			System.out.println("Enter the Product ID");
			int pid=sc.nextInt();
				
				//create object ConnectionTest Class
					ConnectionTest connectionTest = new ConnectionTest();
					con=connectionTest.getConnectionDemo();
				 
				 //create PrepareStatment
				 ps=con.prepareStatement("SELECT * FROM product where pid=?");
				 ps.setInt(1, pid);
				 rs=ps.executeQuery(); 	
					while(rs.next()) { 	
						
						productid=rs.getInt(1);
						pname=rs.getString(2);
						pdesc=rs.getString(3);
						pprice=rs.getDouble(4);
						productqty=rs.getInt(5);
					}
					addtocart(uid,productid,pname,pdesc,pprice);
					
					
					System.out.println("Record find  successfully..");				 
		
					
	
		}catch (Exception e) {
			// TODO: handle exception
		}//end catch
				
	}//end method

	
	//  *************************************
	
	
	public void addtocart(int uid,int productid,String pname,String pdesc,double pprice) {
		uid=Login.userId;
		try {	
			//create object ConnectionTest Class
			ConnectionTest connectionTest = new ConnectionTest();
			con=connectionTest.getConnectionDemo(); 
		 //create PrepareStatment
		 ps=con.prepareStatement("INSERT INTO cart(uid,pid,pname,pdescription,pprice) values(?,?,?,?,?)");
		 ps.setInt(1,uid);
		 ps.setInt(2,productid);
		 ps.setString(3, pname);
		 ps.setString(4, pdesc);
		 ps.setDouble(5, pprice);
		 
		 int i=ps.executeUpdate();
		 System.out.println("Record is inserted successfully.." + i);		 	
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);}
		
		
	}
	
	
	
}
