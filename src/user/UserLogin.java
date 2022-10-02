package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import LunchPackage.TestMain;
import admin.Login;
import product.ConnectionTest;
import product.Product;
import product.SelectProduct;

public class UserLogin {
	
	PreparedStatement ps = null;
	Connection con = null;
	int userChoice;
	
	
		
	public void userLogin() {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1. Existing User ");
			System.out.println("2. New User");
			System.out.println();
			System.out.println("Enter the Your Choice.... >> ");
			userChoice=sc.nextInt();
						switch(userChoice)
						{
						case 1:// Existing user
							
							System.out.println();
							Login login = new Login();
							int status= login.userLogin();
	
							if(status==1)
							{
							 System.out.println("valid"); 
							  UserTask userTask= new UserTask();
							  userTask.userTask();
							}else {
								System.out.println("invalid");
							}		
								break;
						case 2:// New User
								CreateUser cuser = new CreateUser();
								int status1=cuser.userRegistration();
								if(status1==1) {
									Login login1 = new Login();
									int status11= login1.userLogin();
									if(status11==1)
									{
									 System.out.println("valid"); 
									  UserTask userTask= new UserTask();
									  userTask.userTask();
									}else {
										System.out.println("invalid");
									}	
								}else {
									System.out.println("Invalid Input");
								}
								break;
						default:
							System.out.println("---------------------------------------------");
							System.out.println("please enter valid choice");
							break;
							}
					System.out.println("do you want to continue(y/n)");
					userChoice=sc.next().charAt(0);	
			}while((userChoice=='y' || userChoice=='Y') ||  (userChoice=='n' && userChoice=='N'));
		System.out.println("Thanks you User....!");
		
		
	} 
	
	
	public static void main(String[] args) {
		UserLogin u= new UserLogin();
		u.userLogin();
	}
	}
