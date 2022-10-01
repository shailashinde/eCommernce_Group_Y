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
	int adminchoice;
	int userChoice;
		
		Scanner sc = new Scanner(System.in);
		do {	
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
				System.out.println();
				System.out.println("   @  Login Frist @");
				System.out.println("Enter Your Admin Name >>");
				aname= sc.next();
				System.out.println("Enter Your Password >>");
				apwd=sc.next();
				
				//cheack username & password valid or not
				
				AdminLogin adminlogin =new AdminLogin();
				int status =adminlogin.adminLogin();
				if(status==1)
				{
					do {
						System.out.println(" ###########################################################");
						System.out.println("1. Add Product ");
						System.out.println("2. Update Product");
						System.out.println("3. Delete Product");
						System.out.println("4. Show Product");
						System.out.println("5. Quntity check by using Product ID");
						System.out.println("6. Display the User List");
						System.out.println("7. Product purchase Details by perticuler user");
						System.out.println(" ###########################################################");
						System.out.println();
						System.out.println("Enter the Your Choice.... >> ");
						adminchoice=sc.nextInt();
						
						switch(adminchoice)
						{
						case 1://add Product
								InsertProduct ip= new InsertProduct();
								ip.insertProduct();
							break;
						case 2://update Product
								UpdateProduct up= new UpdateProduct();
								up.updateProduct();
								
							break;
						case 3://Delete Product
							break;
						default:
							System.out.println("---------------------------------------------");
							System.out.println("please enter valid choice");
							break;
						}
						System.out.println("do you want to continue(y/n)");
						adminchoice=sc.next().charAt(0);	
					}
					while((adminchoice=='y' || adminchoice=='Y') ||  (adminchoice=='n' && adminchoice=='N'));
					System.out.println("Thanks you Admin....!");
				}
				else{System.out.println("Invalid Admin Name & Password");}	
				break;
				// ###############################  User  ###########################################
			case 2:
				//User
				do {
					System.out.println("1. Existing User ");
					System.out.println("2. New User");
					System.out.println();
					System.out.println("Enter the Your Choice.... >> ");
					userChoice=sc.nextInt();
								switch(userChoice)
								{
								case 1:// Existing user
										UserLogin userlogin= new UserLogin();
										int statususer= userlogin.userLogin();
										if(statususer==1)
										{ System.out.println("Vaild");
											
										}else{System.out.println("Invalid UserName & Password");}		
										break;
								case 2:// New User
										CreateUser cuser = new CreateUser();
										cuser.userRegistration();
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
