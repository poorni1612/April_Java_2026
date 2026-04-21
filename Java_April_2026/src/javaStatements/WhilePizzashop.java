package javaStatements;

import java.util.Scanner;

public class WhilePizzashop {

	public static void main(String[] args) {
	/*Code for a pizza shop which accepts pizza order for the day upto 100 pizza. THey should 
	accept only until the limit and stop accepting order once it hits 100 */
		Scanner sc=new Scanner(System.in);
		int order=100,numofpizza;
		boolean pizza_availability=true;
		while(pizza_availability)
		{
			System.out.println("\n"+"Enter How many pizzas would you like to order");
			numofpizza=sc.nextInt();
			
			 if(numofpizza<=order)
			 {
				 order=order-numofpizza;
				 System.out.println("Thank you for the order"+"\n");
					System.out.println("\n"+"Available pizza count after your last order"+order);
			 }
			 else
			System.out.println("Enter the number within limit");
			
			if(order<=0){
				pizza_availability=false;
				System.out.println("WE RAN OUT OF PIZZA!!");
			}
		}

	}

}
