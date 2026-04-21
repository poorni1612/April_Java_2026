package javaStatements;
/*Problem: The Savings Goal Calculator
Imagine you are saving up to buy a new gaming console or phone that costs $500. You currently have $0 in 
your piggy bank, but you plan to save $45 every single week.

Write a program using a while loop to calculate exactly how many weeks it will take you to reach 
(or pass) your goal.*/

public class WhilePiggybank {
	

	public static void main(String[] args) {
		int balance=0;
		int Goal=500;
		int week=0;
		
		while(balance<Goal)
		{ 
			
		    balance=balance+45;
			week++;
			System.out.println("Balance in week"+week+"is"+balance);
			if(balance>=250 && balance<300)
				System.out.println("You are halfway through with the balance"+balance+"In week"+week);
			
		}
		
		System.out.println("You will have enough money in week"+week);
	}

}
