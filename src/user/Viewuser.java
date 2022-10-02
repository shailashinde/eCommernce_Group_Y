package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import product.ConnectionTest;

public class Viewuser {
	
		public void viewUser() {
			
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs;
		
		try {
			//create object ConnectionTest Class
			ConnectionTest connectionTest = new ConnectionTest();
			con=connectionTest.getConnectionDemo();
			
			//Prepare statement //Select query
			ps=con.prepareStatement("select * from user");
			rs=ps.executeQuery();
			System.out.println("user ID || user Name || User password || 	User Email   \t \t  || \t \t User Phone || \t User Address || ");
			while(rs.next()) { 			
				/*System.out.println("user ID>> " +rs.getInt(1)); 
				System.out.println("user Name>> " +rs.getString(2));
				System.out.println("user pwd>> " + rs.getString(3));
				System.out.println("user email>> " +rs.getString(4));
				System.out.println("user phone>> " +rs.getString(5));
				System.out.println("user address>> " +rs.getString(6));*/
				System.out.println(rs.getInt(1) +"\t \t"+ rs.getString(2) +"\t \t"+ rs.getString(3) +"\t \t "+ rs.getString(4)+"\t \t"+ rs.getString(5)+"\t \t"+ rs.getString(6));
			}
			System.out.println();
		} catch (Exception e) {
		e.getMessage();
		System.out.println(e);
		}		
	}// end viewUSer() 
	

}
