package javaStatements;

public class ControlStatements {
	char num=10;

	void switchCase()
	
	{
		switch(num)
		{
		case 0:
			System.out.println("Case 0");
			break;
		case 1:
			System.out.println("Case 1");
			break;
		case 10:
			System.out.println("Case 10");
			break;
		default:
			System.out.println("Default block");
		
		}
		
	}
	void ifStatement()
	{
		if(num<10) {
			
		
			System.out.println("Less than 10");}
		else if(num==10)
		{
			System.out.println("num is exactly 10");
		}
		else
			System.out.println("None of this works");
			
	}
	
	public static void main(String[] args) {
		
		ControlStatements c=new ControlStatements();
		c.switchCase();
		c.ifStatement();
		
		
	}

}
