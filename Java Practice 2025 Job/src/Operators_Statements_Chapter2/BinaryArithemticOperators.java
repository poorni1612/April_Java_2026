package Operators_Statements_Chapter2;

public class BinaryArithemticOperators {

	public static void main(String[] args) {
		// Arithmetic operators +,-,*,%,/
		//Operations are usually executes from left to right
		//*,%,/ takes higher precedence than +,-
		//Parentheses takes higher precedence than multiplication operators
		int x=20*5/4+7-20;
		System.out.println(x);
          int y=20*(5+4)/3;//in this line parentheses takes higher precedence than the other higher precedence operators
          System.out.println(y);
          

	}

}
