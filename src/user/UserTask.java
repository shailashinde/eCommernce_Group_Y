package user;

import java.util.Scanner;

import cart.InsertCartItem;
import cart.SelectCartItem;
import product.InsertProduct;
import product.SelectProduct;
import product.UpdateProduct;

public class UserTask {
	
	public void userTask(){
		int usertask;
		Scanner sc= new Scanner(System.in);
		try {
		do {
			System.out.println(" ###########################################################");
			System.out.println("1. View Product ");
			System.out.println("2. AddTo cart Product");
			System.out.println("3. Cart View ");
			System.out.println(" ###########################################################");
			System.out.println();
			System.out.println("Enter the Your Choice.... >> ");
			usertask=sc.nextInt();
			
			switch(usertask)
			{
			case 1://View Product
					SelectProduct p=new  SelectProduct();
					p.selectProduct();
					break;
			case 2://Add to Cart 
						SelectProduct pp=new  SelectProduct();
						pp.selectProduct();
						InsertCartItem ici= new InsertCartItem();
						ici.insertcartItem();	
						break;
			case 3://View Cart 
						SelectCartItem s= new SelectCartItem();
						s.selectCart();
					break;
			default:
						System.out.println("---------------------------------------------");
						System.out.println("please enter valid choice");
						break;
			} //switch end
			
			System.out.println("do you want to continue(y/n)");
			usertask=sc.next().charAt(0);	
		}while((usertask=='y' || usertask=='Y') ||  (usertask=='n' && usertask=='N'));
		
		System.out.println("Thanks you User....!");
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		}//end method
	
	public static void main(String[] args) {
		UserTask ut= new UserTask();
		ut.userTask();
	}
}//end class
