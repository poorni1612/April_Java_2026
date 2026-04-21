package javaStatements;

public class WhileLoop {

	public static void main(String[] args) {
		/*intialization should be done*/int num1=1;
		
		//End condition should be given
		while( num1<=5)
		{System.out.println("Multiplication table for "+num1);
		    int num2=1;
			while(num2<=10)
			{
			System.out.println(num1+"*"+num2+"="+num2*num1);
			//Logic, decrement,increment should be given
			num2++;
			
		}
			num1++;
	}
	}
}


