package javaStatements;

import java.util.Scanner;

public class ForLoop {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number that needs multiplication table");

		int num1=sc.nextInt();
		System.out.println("Enter the second numnber for multplication");
		int num2=sc.nextInt();
		
		for(int i=num1;i<=num2;i++)
		{
			System.out.println("Mulitplication talbe for "+i);
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
}

