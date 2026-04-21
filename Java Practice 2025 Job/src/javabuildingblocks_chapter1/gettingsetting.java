// This program is the example of field initialization, instance initializer and constructor initializing and the order
//initializatin happens in a program


package javabuildingblocks_chapter1;

public class gettingsetting {
	 
	 int num; String name;
	 
	 {System.out.println("Instance initializer");}/* instance initializer is a code block outside a method floating anywhere 
	 in a class to initialize a member*/
	 { name="Pooornima";}
	public static void main(String[] args) {
		{System.out.println("Inside main start");}
		gettingsetting g=new gettingsetting();
		g.num=1;
		System.out.println(g.num+1);
		{System.out.println("Inside main end");}
		

	}
	{System.out.println("Instance initializer2");}

}
