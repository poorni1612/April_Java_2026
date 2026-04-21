
//This program is the example for garbage collection

package javabuildingblocks_chapter1;

public class StringRefernce {
	public static void main(String a[])
	{
		String one,two;
		one= new String("a");//craeted an object with the vsalue "a" in heap memory which is pointed by instance one
		two=new String("b");//craeted an object with the vsalue "b" in heap memory which is pointed by instance two
		one=two;// now one reference variable points to the object meory location of two
		
		String three=one;
		System.out.println(one+two+three);
		one=null;
		System.out.println(one+three);;
		
		}

}
// In this above program object value "a" is heap memory goes out of scope once the refrence points to another object so it goes to garbage collection