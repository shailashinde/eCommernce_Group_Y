package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import LunchPackage.TestMain;
import product.ConnectionTest;
import product.DeleteProduct;
import product.InsertProduct;
import product.SelectProduct;
import product.UpdateProduct;
import user.Viewuser;

public class AdminLogin {
	PreparedStatement ps = null;
	Connection con = null;
	int adminchoice;
	int status=0;
	//adminLogin() Method
	public void adminLogin() {
		Scanner sc = new Scanner(System.in);
		try {
			
				Login login=new Login();
				int status=	login.adminLogin();
				//aname.equals("shaila") && apwd.equals("shaila")
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
							InsertProduct inserproduct= new InsertProduct();
							inserproduct.insertProduct();
							break;
					case 2://update Product
							UpdateProduct updateproduct= new UpdateProduct();
							updateproduct.updateProduct();	
							break;
					case 3://Delete Product
							DeleteProduct deleteproduct= new DeleteProduct();
							deleteproduct.deleteProduct();
							break;
					case 4: //Show Product
							SelectProduct selectProduct=new SelectProduct();
							selectProduct.selectProduct();
							break;
					case 5: //Quntity check by using Product ID	
							QuantityCheck quantitycheck= new QuantityCheck();
							quantitycheck.quantityCheck();
							break;
					case 6: //Display the User List
							Viewuser selectUser= new Viewuser();
							selectUser.viewUser();
							break;	
					case 7:	//Product purchase Details by perticuler user
							Product_purchase_by_id pid=new Product_purchase_by_id();
							pid.product_purchase_by_perticular_id();
							break;
					default:
						System.out.println("---------------------------------------------");
						System.out.println("please enter valid choice");
						break;
					} //switch end
					
					System.out.println("do you want to continue(y/n)");
					adminchoice=sc.next().charAt(0);	
				}while((adminchoice=='y' || adminchoice=='Y') ||  (adminchoice=='n' && adminchoice=='N'));
				
				System.out.println("Thanks you Admin....!");
			}//if end
			else{System.out.println("Invalid Admin Name & Password");}	//else end
				}catch (Exception e) {e.printStackTrace();}
		
			//end method
	}	
		
}//end class
