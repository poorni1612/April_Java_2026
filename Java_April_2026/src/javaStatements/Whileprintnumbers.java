package javaStatements;

import java.util.Scanner;

public class Whileprintnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit to print all Even numbers");
		int limit=sc.nextInt();
	int num=1;
		
		while(num<=limit)
		{
			int temp=num;
			if(temp%2==0)
			System.out.println(temp);
			num++;
		}
		

	}

}
