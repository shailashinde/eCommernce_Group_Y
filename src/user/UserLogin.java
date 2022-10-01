package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import LunchPackage.TestMain;
import product.ConnectionTest;

public class UserLogin {
	
	PreparedStatement ps = null;
	Connection con = null;
	
	int status=0;
	//adminLogin() Method
	public int userLogin() {
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println();
			System.out.println("   @ Login Frist @");
			System.out.println("Enter Your User Name >>");
			String uname= sc.next();
			System.out.println("Enter Your Password >>");
			String upwd=sc.next();
			new User(uname, upwd);
		//create object ConnectionTest Class
		ConnectionTest connectionTest = new ConnectionTest();
		con=connectionTest.getConnectionDemo();
		 //create prepareStatment 
		
		ps=con.prepareStatement("select uname,upwd from user where uname=uname and upwd=upwd ");
		ResultSet rs=ps.executeQuery();
		System.out.println(rs);
		if(rs.next()){
			String username= rs.getString(1);
			String pwd=rs.getString(2);
			System.out.println(username+ ""+ pwd);
			status=1;
		}
		}catch (Exception e) {
			e.printStackTrace();	
		}	
		return status;

	}
	
	 public static void main(String[] args) {
		UserLogin ul=new UserLogin();
		ul.userLogin();
	} 

}
