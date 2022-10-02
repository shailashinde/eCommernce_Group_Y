package product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class UpdateProduct {
	
	PreparedStatement ps = null;
	Connection con = null;
	int choice;
	int pid;
	String pname;
	String pdescription;
	double pprice;
	int pqty;
	
	
	public void updateProduct() {
		
		Scanner sc = new Scanner(System.in);		
		do {	
			System.out.println("1. Update All Product field Details >>");
			System.out.println("Enter the Your Choice.... >> ");
			choice=sc.nextInt();
			
			//System.out.println("2. Update Product Name >>");
			//System.out.println("3. Update Product Description >>");
			//System.out.println("4. Update Product Product Price >>");
			//System.out.println("5. Product Quntity >>");
			//System.out.println("Enter the your Choice for Updation >> ");
			
			UpdateProduct updatep = new UpdateProduct();
			switch(choice)
			{
			case 1:		//update product all records
							updatep.updateAllfield();
						break;
			case 2:		//update product Name
						updatep.updateProductName();
						break;			
			case 3:		//update Product description
						updatep.updateProductDescription();
						break;
			case 4:		//update product price
						updatep.updateProductPrice();
						break;
			case 5:		//all records
						updatep.updateProductQuntity();
						break;
			default:	System.out.println("---------------------------------------------");
						System.out.println();
						System.out.println("please enter valid choice");
						break;
				} // end switch
				System.out.println("do you want to continue(y/n)");
				choice=sc.next().charAt(0);	
			}while((choice=='y' || choice=='Y') ||  (choice=='n' && choice=='N'));
			
		}
	
			public void updateAllfield() {
				Scanner sc = new Scanner(System.in);
				try {
					
					System.out.println("Enter Product name >> "); 
					 pname = sc.nextLine(); 
					System.out.println("Enter product description >> "); 
					 pdescription = sc.nextLine();
					System.out.println("Enter product Price >> "); 
					 pprice = sc.nextDouble();
					System.out.println("Enter Product Quantity >> "); 
					 pqty = sc.nextInt();
					 System.out.println("Enter Product ID >> "); 
					 pid = sc.nextInt();
					//new Product(pid, pname, pdescription, pprice, pqty);
					
					 //create object ConnectionTest Class
					ConnectionTest connectionTest = new ConnectionTest();
					con=connectionTest.getConnectionDemo();					 
					 //create PrepareStatment
					 ps=con.prepareStatement("UPDATE product set pname=?, pdescription=?, pprice=?,pqty=? where pid=? ");
					 ps.setString(1, pname);
					 ps.setString(2, pdescription);
					 ps.setDouble(3, pprice);
					 ps.setInt(4, pqty);
					 ps.setInt(5, pid);
					 int i=ps.executeUpdate();
					 System.out.println("Record is update successfully.." + i);		 
					}catch (Exception e) {
						e.printStackTrace();
						System.out.println(e);
					}finally {
						
					}
				
			}
			public void updateProductName() {}
			public void updateProductDescription() {}
			public void updateProductPrice() {}
			public void updateProductQuntity() {}
			
			
}