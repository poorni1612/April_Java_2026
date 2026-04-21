package Operators_Statements_Chapter2;

public class Numeric_Promotions {

	public static void main(String[] args) {
		// there are 4 rules in Numeric promotions 
		//Rule 1: If the datatype doesn't match the java will automatiocally promote the smaller data type to larger type before acting upon it
		// Rule 2: If there are integral and floaing point numerals are there in an expression java will promote int to float before acting upon it
		//Rule 3: If there smaller types like byte,short,char present java will always consider/promote them as an integer
		//Rule 4: After all promotions the new value will be assigned to the type of higher type as it's promoted operands
		
		
		//Example for Rule 1:
		int x=4;
		long l=34;
	long y=x+l;// in this example int is automatically promoted to long inorder to act upon it and stores in a long variable
	System.out.println(y);
	
	//Example for Rule 2:
	double d=39.21;
	float f=2.1F;// will not compile if not followd by an F at the end of the assigning of the variable 
	
		double d1=d+f;// Float f is promoted to float to act upon it as Rule 2
	System.out.println(d1);
	//Example for Rule 3:
	
	short s=12;
	short s1=34;
	int i=s+s1;
	System.out.println(i);// if java sees a smaller literal types it will automatically promote to it to int 
	
	// Example for Rule 4;
	
	int i1=9000;
	double d2=4000_000;
	double d3=i1+d2;
	System.out.println(d3);// Always stores the operational value to the type of promoted operands 
		

	}

}
