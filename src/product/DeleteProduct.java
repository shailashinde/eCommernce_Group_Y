package product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteProduct {

	public void deleteProduct() {
		
		
		
		
		int pid;
		PreparedStatement ps;
		Connection con;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Delete Product class");
		try {
			System.out.println("Enter Product ID >> "); 
			 pid = sc.nextInt();
			//create object ConnectionTest Class
				ConnectionTest connectionTest = new ConnectionTest();
				con=connectionTest.getConnectionDemo();
			 
			 //create PrepareStatment
			 ps=con.prepareStatement("DELETE FROM	product where pid=? ");
			 ps.setInt(1, pid);
			 int i=ps.executeUpdate();
			 System.out.println("Record is Deleted successfully.." + i);	
			 
			 
			 
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
