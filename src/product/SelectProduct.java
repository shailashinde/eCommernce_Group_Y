package product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectProduct {

	public void selectProduct() {
		// TODO Auto-generated method stub
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs;
		
		try {
			//create object ConnectionTest Class
			ConnectionTest connectionTest = new ConnectionTest();
			con=connectionTest.getConnectionDemo();
			
			// Prepare statement //Select query
			ps=con.prepareStatement("select * from product");
			
			rs=ps.executeQuery(); //We will be getting Result set after executing the query
			
			System.out.println("Product ID || Product Name || product Description || product price || product Quantity ");
			while(rs.next()) { //We will be checking if result set has record or not			
				/* System.out.println("Product ID>> " +rs.getInt(1)); 
				System.out.println("Product Name>> " +rs.getString(2));
				System.out.println("Product Description>> " + rs.getString(3));
				System.out.println("Product Price>> " +rs.getDouble(4));
				System.out.println("Product Quantity>> " +rs.getInt(5));*/
				System.out.println(rs.getInt(1) +"\t \t"+ rs.getString(2) +"\t \t"+ rs.getString(3) +"\t \t "+ rs.getDouble(4)+"\t \t"+ rs.getInt(5));
				
			}
			System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
		}		
	}// end selectProduct() 
	public static void main(String[] args) {
		SelectProduct s= new SelectProduct();
		s.selectProduct();
	}
}
