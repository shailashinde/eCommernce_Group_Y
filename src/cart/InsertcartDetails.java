package cart;

import java.sql.Connection;
import java.sql.PreparedStatement;

import product.ConnectionTest;

public class InsertcartDetails {
	PreparedStatement ps = null;
	Connection con = null;
	
		public void cart() {
			int uid=1;
			int pid=1;
			int pqty=2;
			int cid=2;
			double ptotalcost=24343d;
			try {	
				//create object ConnectionTest Class
				ConnectionTest connectionTest = new ConnectionTest();
				con=connectionTest.getConnectionDemo(); 
			 //create PrepareStatment
			 ps=con.prepareStatement("INSERT INTO cart(cid,uid,pid,pqty,ptotalcost) VALUES(?,?,?,?,?) ");
			 ps.setInt(1, cid);
			 ps.setInt(2, uid);
			 ps.setInt(3, pid);
			 ps.setInt(4, pqty);
			 ps.setDouble(5, ptotalcost);
			 int i=ps.executeUpdate();
			 System.out.println("Record is inserted successfully.." + i);		 
			
			
				
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println(e);
			}
		}
		public static void main(String[] args) {
			InsertcartDetails i= new InsertcartDetails();
			i.cart();
		}
}
