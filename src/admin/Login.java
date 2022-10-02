package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import product.ConnectionTest;

public class Login {
	Connection con;
	PreparedStatement ps;
	int status=0;
	public static int userId;
	
		public int adminLogin() {
				try {
					Scanner sc=new Scanner(System.in);
					System.out.println();
					System.out.println("   @Admin Login@");
					System.out.println("Enter Your Admin Name >>");
					String aname= sc.next();
					System.out.println("Enter Your Password >>");
					String apwd=sc.next();
					
						//create object ConnectionTest Class
						ConnectionTest connectionTest = new ConnectionTest();
						con=connectionTest.getConnectionDemo();
						//create prepareStatment 
						ps=con.prepareStatement("select aname from admin where aname=? and apwd=?" );
						ps.setString(1, aname);
						ps.setString(2, apwd);
						ResultSet rs=ps.executeQuery();
						
						if(rs.next()){
							//System.out.println(rs.getString(1));
							 status=1;
						}//end if
						
					}catch (Exception e) {
							// TODO: handle exception
				}//end catch
						return status;
		}//end method
		
		
		
		
		// #########################################################################
		
		
		
		public int userLogin() {
			try {
				Scanner sc=new Scanner(System.in);
				System.out.println();
				System.out.println("   @User Login@");
				System.out.println("Enter Your User Name >>");
				String uname= sc.next();
				System.out.println("Enter Your Password >>");
				String upwd=sc.next();
				
					//create object ConnectionTest Class
					ConnectionTest connectionTest = new ConnectionTest();
					con=connectionTest.getConnectionDemo();
					//create prepareStatment 
					ps=con.prepareStatement("select uid from user where uname=? and upwd=?" );
					ps.setString(1, uname);
					ps.setString(2, upwd);
					ResultSet rs=ps.executeQuery();
					
					if(rs.next()){
						userId=rs.getInt(1);
						 status=1;
					}//end if
					
				}catch (Exception e) {
						// TODO: handle exception
			}//end catch
					return status;
	}//end method
			
		
}//end class
