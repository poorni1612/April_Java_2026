package access.parent;

public class ProtectedClassParent {
protected String Id="NameCode";

protected void parentMethod()
{
	System.out.println(Id+" from Parent Class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedClassParent p=new ProtectedClassParent();
		p.parentMethod();

	}

}
