package access.child;
import access.parent.*;
public class AccessChildClass extends ProtectedClassParent {
	String ChildId=	Id;
	void childMethod()
	{
		parentMethod();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessChildClass a=new AccessChildClass();
	a.childMethod();
	
	

	}

}
