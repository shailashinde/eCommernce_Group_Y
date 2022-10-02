package cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import product.ConnectionTest;
import product.Product;

public class InsertCartItem {
		Connection con;
		PreparedStatement ps;
	public void insertcartItem() {
		
		Scanner sc= new Scanner(System.in);
		int choice;
		try {
			
			ArrayList al= new ArrayList();
			HashMap<Integer, ArrayList> cart = new HashMap<Integer, ArrayList>();
			
			do {
			System.out.println("Enter the Product ID");
			int pid=sc.nextInt();
			System.out.println("Enter the Product Qty");
			int pqty=sc.nextInt();
			
			PreparedStatement ps;
			Connection con;
			ResultSet rs;
		
			try {
				
				//create object ConnectionTest Class
					ConnectionTest connectionTest = new ConnectionTest();
					con=connectionTest.getConnectionDemo();
				 
				 //create PrepareStatment
				 ps=con.prepareStatement("SELECT pname,pdescription,pprice,pqty FROM product where pid=?");
				 ps.setInt(1, pid);
				 rs=ps.executeQuery(); 	
					while(rs.next()) { 				
						al.add(rs.getString(1));
						al.add(rs.getString(2));
						al.add(rs.getDouble(3));
						al.add(rs.getInt(4));
						al.add(pqty);
						cart.put(1, al);
					}
					
					System.out.println(cart);
					System.out.println("Record find  successfully..");				 
				}catch (Exception e) {
				e.printStackTrace();
				System.out.println(e);}
			System.out.println("do you want to add more item into cart (y/n)");
			choice=sc.next().charAt(0);	
		}
		while((choice=='y' || choice=='Y') ||  (choice=='n' && choice=='N'));
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}//end catch
		
			
			 
				
			
			
			
			
			
			
			
		
		
	}//end method
	
	public static void main(String[] args) {
		InsertCartItem ici= new InsertCartItem();
		ici.insertcartItem();
	}
}
