package product;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProductMethods {
	PreparedStatement ps = null;
	Connection con = null;
	
	//1 Insert Method-------------------------------------------
		
		
		
		public void insertProduct1(String pname,String pdescription,double pprice,int pqty) {
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

		//2 update Method-------------------------------------------
		
		
		
				public void updateProduct1(String pname,String pdescription,double pprice,int pqty) {
					try {
					//create object ConnectionTest Class
					ConnectionTest connectionTest = new ConnectionTest();
					con=connectionTest.getConnectionDemo();
					 
					
					 //create PrepareStatment
					 ps=con.prepareStatement("UPDATE product set pname=?, pdescription=?, pprice=?,pqty=? where pid=? ");
					 ps.setString(1, pname);
					 ps.setString(2, pdescription);
					 ps.setDouble(3, pprice);
					 ps.setInt(4, pqty);
					 
					 int i=ps.executeUpdate();
					 System.out.println("Record is update successfully.." + i);		 
					}catch (Exception e) {
						e.printStackTrace();	
					}	 
				}

}
