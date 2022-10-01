package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import LunchPackage.TestMain;
import product.ConnectionTest;

public class AdminLogin {
	PreparedStatement ps = null;
	Connection con = null;
	
	int status=1;
	//adminLogin() Method
	public int adminLogin() {
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println();
			System.out.println("   @ Login Frist @");
			System.out.println("Enter Your Admin Name >>");
			String aname= sc.next();
			System.out.println("Enter Your Password >>");
			String apwd=sc.next();
			
		//create object ConnectionTest Class
		ConnectionTest connectionTest = new ConnectionTest();
		con=connectionTest.getConnectionDemo();
		
		//create prepareStatment 
		ps=con.prepareStatement("select aname from admin where aname="+aname+" and apwd="+apwd );
		ResultSet rs=ps.executeQuery();
		//System.out.println(rs);
		if(rs.next()){
			//System.out.println(rs.getString(1));
			status=0;
		}
		}catch (Exception e) {
			e.printStackTrace();	
		}	
		return status;

	}
	
	
}
