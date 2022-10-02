package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import product.ConnectionTest;

public class QuantityCheck {

	
	public void quantityCheck() {
		// TODO Auto-generated method stub
		System.out.println("Quntity check by using Product ID");
		
		int pid;
		PreparedStatement ps;
		Connection con;
		ResultSet rs;
		Scanner sc= new Scanner(System.in);
		try {
			System.out.println("Enter Product ID >> "); 
			 pid = sc.nextInt();
			//create object ConnectionTest Class
				ConnectionTest connectionTest = new ConnectionTest();
				con=connectionTest.getConnectionDemo();
			 
			 //create PrepareStatment
			 ps=con.prepareStatement("SELECT pname,pqty FROM product where pid=?");
			 ps.setInt(1, pid);
			 rs=ps.executeQuery(); 
				
				while(rs.next()) { 			
					System.out.println("Product Name>> " +rs.getString(1)); 
					System.out.println("Product quntity>> " +rs.getString(2));				
				}
				System.out.println("Record find  successfully..");				 
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e);
		}
		

	}// end method
	public static void main(String[] args) {
		QuantityCheck qc= new QuantityCheck();
		qc.quantityCheck();
	}

}//end class
