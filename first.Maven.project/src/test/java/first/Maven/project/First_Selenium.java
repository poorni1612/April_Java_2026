package first.Maven.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class First_Selenium {
	
	 static ChromeDriver driver;
	
	void launchBrowser() {
		
		
		ChromeOptions options = new ChromeOptions();
		
		 options.addArguments("--incognito");
		 driver=new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		System.out.println("Browser Launched");

	}
void userLogin(String Username,String UPassword)
{		WebElement User_name=driver.findElement(By.id("user-name"));
WebElement Password=driver.findElement(By.name("password"));
WebElement Submit=driver.findElement(By.id("login-button"));
User_name.sendKeys(Username);
Password.sendKeys(UPassword);
Submit.click();
System.out.println("****User named\t"+Username+" Logged-in Successfully*****");
	
}
void addToCart()
{
	
    WebElement AddBackpack=driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']"));
	AddBackpack.click();
	WebElement AddTshirt=driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
	
	AddTshirt.click();
	System.out.println("Items Added to the Cart");
	
}
void removeFromCart() {
	WebElement RemoveButton=driver.findElement(By.xpath("//*[@id='remove-sauce-labs-backpack']"));
			
	RemoveButton.click();
	System.out.println("Item(s) Removed");
	
}
void shoppingCart() throws InterruptedException 
{
	WebElement Cart=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
     Cart.click();
     
	WebElement Checkout=driver.findElement(By.xpath("//*[@id='checkout']"));
	Checkout.click();
	System.out.println("Checkout in-Progress,Enter Shipment Details");
	Thread.sleep(1000);
	
	
}
void enterUserInfo(String Fname,String Lname,int Zip) throws InterruptedException
{
	WebElement F_name=driver.findElement(By.xpath("//input[@id='first-name']"));
	F_name.sendKeys(Fname);
	Thread.sleep(200);
	
	WebElement L_name=driver.findElement(By.xpath("//input[@id='last-name']"));
	L_name.sendKeys(Lname);
	WebElement ZipCode=driver.findElement(By.xpath("//input[@id='postal-code']"));
	ZipCode.sendKeys(String.valueOf(Zip));
	WebElement ContinueButton;
	ContinueButton=driver.findElement(By.xpath("//input[@id='continue']"));
	ContinueButton.click();
	Thread.sleep(1000);
	
	WebElement FinishButton=driver.findElement(By.xpath("//button[@id='finish']"));
	FinishButton.click();
	Thread.sleep(1000);
	System.out.println("The Order placed Successfully");	
	
}
	public static void main(String[] args) throws InterruptedException  {
		
		
		First_Selenium FS=new First_Selenium();
		FS.launchBrowser();
		FS.userLogin("standard_user","secret_sauce");
		FS.addToCart();
		FS.removeFromCart();
		
		FS.shoppingCart();
		FS.enterUserInfo("Name","Address",123456);
		
		driver.close();
		
		


}
}
