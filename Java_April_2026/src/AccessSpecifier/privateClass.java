package AccessSpecifier;

public class privateClass {
private String Id="Poornima1612";

private void printId()
{
	System.out.println(Id);
}
private void callMethod() {
	printId();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		privateClass p= new privateClass();
		p.callMethod();

	}

}
