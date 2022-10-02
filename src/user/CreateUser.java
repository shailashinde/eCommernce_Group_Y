package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import product.ConnectionTest;

public class CreateUser {

	PreparedStatement ps = null;
	Connection con = null;
	int i;
	 //user registration method
	public int userRegistration() {
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the name >> "); 
			String uname = sc.nextLine(); 
			System.out.println("Enter the Password >> "); 
			String upwd = sc.nextLine();
			System.out.println("Enter the Email ID  >> "); 
			String uemail = sc.nextLine();
			System.out.println("Enter the Phone Number >> "); 
			String uphone = sc.nextLine();
			System.out.println("Enter the Address >> "); 
			String uaddress = sc.nextLine();
			
			
			new User(uname,upwd, uemail, uphone, uaddress);
			
			//create object ConnectionTest Class
			ConnectionTest connectionTest = new ConnectionTest();
			con=connectionTest.getConnectionDemo();
		 
		 //create PrepareStatment
		 ps=con.prepareStatement("INSERT INTO user(uname,upwd,uemail,uphone,uaddress) VALUES(?,?,?,?,?) ");
		 ps.setString(1, uname);
		 ps.setString(2, upwd);
		 ps.setString(3, uemail);
		 ps.setString(4, uphone);
		 ps.setString(5, uaddress);
		 
		 i=ps.executeUpdate();
		 System.out.println("Record is inserted successfully.." + i);		 
		}catch (Exception e) {
			e.printStackTrace();	
		}	finally {
			//sc.close();
		} 
		return i;
	}

}
