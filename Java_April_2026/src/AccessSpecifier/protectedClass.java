package AccessSpecifier;

public class protectedClass {
	protected String noise="quack from Protected Class";

protected void makeSound() {
	System.out.println(noise);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
protectedClass p =new protectedClass();
p.makeSound();

	}

}
