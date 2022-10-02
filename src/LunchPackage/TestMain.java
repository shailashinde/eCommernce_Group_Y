package LunchPackage;

import java.util.Scanner;

import admin.AdminLogin;
import product.InsertProduct;
import product.UpdateProduct;
import user.CreateUser;
import user.UserLogin;

public class TestMain {
public	static String aname;
public	static String apwd;
	

	public static void main(String[] args) {
		
	int categaries;	
		Scanner sc = new Scanner(System.in);
		do {	
			System.out.println(" .......Welcome To E-Commernce .....!");
			System.out.println();
			System.out.println(" ###########################################################");
			System.out.println("1. ADMIN");
			System.out.println("2. USER");
			System.out.println(" ###########################################################");
			System.out.println();
			System.out.println("Enter your choice Categaries >> ");
			categaries=sc.nextInt();
			
			switch(categaries)
			{
			case 1:
					// ############################################  Admin  ####################################
				
						AdminLogin adminlogin =new AdminLogin();
						adminlogin.adminLogin();
						break;
						// ###############################  User  ###########################################
			case 2:
				//User
					UserLogin userLogin=new UserLogin();
					userLogin.userLogin();
					break;
			default:
				System.out.println("---------------------------------------------");
				System.out.println("please enter valid choice");
				break;
			}
			System.out.println("do you want to continue(y/n)");
			categaries=sc.next().charAt(0);	
		}
		while((categaries=='y' || categaries=='Y') ||  (categaries=='n' && categaries=='N'));
		System.out.println("Thank You!!!!");
		}
	
}
