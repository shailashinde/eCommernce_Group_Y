package cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import admin.Login;
import product.ConnectionTest;

public class SelectCartItem {
	int uid;
	public void selectCart() {
		// TODO Auto-generated method stub
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs;
		
		uid=Login.userId;
		//System.out.println("uid"+uid);
		try {
			//create object ConnectionTest Class
			ConnectionTest connectionTest = new ConnectionTest();
			con=connectionTest.getConnectionDemo();
			
			// Prepare statement //Select query
			ps=con.prepareStatement("select pid,pname,pdescription,pprice from cart where uid=?");
			ps.setInt(1, uid);
			
			rs=ps.executeQuery(); //We will be getting Result set after executing the query
			
			System.out.println("product ID ||   Product Name || product Description || product price ||  ");
			while(rs.next()) { //We will be checking if result set has record or not			
				
				System.out.println(rs.getInt(1) +"\t \t"+ rs.getString(2) +"\t \t"+ rs.getString(3) +"\t \t "+ rs.getDouble(4)+"\t \t");
				
			}
			System.out.println();
		} catch (Exception e) {
			e.getMessage();
			System.out.println(e);
		}		
	}// end selectProduct() 
	
	
}
