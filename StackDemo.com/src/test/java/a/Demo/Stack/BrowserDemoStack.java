
/*Coded By:Poornima Velayutham
 * Coded on:9/18/2025
 * Code Description: This is to test the https://bstackdemo.com/ page locating the elements using Relative XPath to test the Happy Path flow*/
package a.Demo.Stack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDemoStack {
	static ChromeDriver driver = new ChromeDriver();

	void launchBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver.get("https://bstackdemo.com/signin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	void userLogin() throws Exception

	{

		WebElement Username = driver.findElement(By.xpath("//div[@class=' css-2b097c-container' and @id='username']"));
		Username.click();
		WebElement SelectUsername = driver.findElement(By.xpath("//div[text()='demouser']"));
		SelectUsername.click();
		WebElement Password = driver.findElement(By.xpath("//div[@class=' css-2b097c-container' and @id='password']"));
		Password.click();
		WebElement EnterPassword = driver.findElement(By.xpath("//div[text()='testingisfun99']"));
		EnterPassword.click();
		WebElement Login_Button = driver.findElement(By.xpath("//button[@id='login-btn']"));
		Login_Button.click();

	}

	void productAddToCart() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Iphone11ProBtn = driver.findElement(By.xpath("//div[@id='6']//div[text()='Add to cart']"));
		Iphone11ProBtn.click();
		WebElement Iphone = driver.findElement(By.xpath("//div[@id='1']//div[text()='Add to cart']"));
		Iphone.click();
		WebElement Iphonepro = driver.findElement(By.xpath("//div[@id='3']//div[text()='Add to cart']"));
		Iphonepro.click();
		driver.findElement(By.xpath("//div[@class='buy-btn']")).click();
	}

	void userInfo() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='firstNameInput']")).sendKeys("F_NAME");
		driver.findElement(By.xpath("//input[@id='lastNameInput']")).sendKeys("L_NAME");
		driver.findElement(By.xpath("//div[@class='form-field']//input[@id='addressLine1Input']"))
				.sendKeys("Address is within the US");
		driver.findElement(By.xpath("//div[@class='form-field']//input[@id='provinceInput']")).sendKeys("TX");
		driver.findElement(By.xpath("//div[@class='form-field']//input[@id='postCodeInput']")).sendKeys("76253");
		driver.findElement(By.xpath("//button[@id='checkout-shipping-continue']")).click();
		Thread.sleep(1000);

	}

	void orderSummary() throws InterruptedException {
		WebElement Order_No = driver.findElement(By.xpath("//div[@class='checkout-form']//strong"));
		WebElement Tot_Amt = driver.findElement(By.xpath("//span[@class='cart-priceItem-value']//span"));
		System.out.println("Your Order number is " + Order_No.getText());
		WebElement Order_Details = driver.findElement(By.xpath("//ul[@class='productList']"));
		System.out.println(" Order Details are hereby :" + Order_Details.getText());
		System.out.println("Total Amount" + Tot_Amt.getText());
		Thread.sleep(1000);
	}

	public static void main(String[] args) throws Exception {
		BrowserDemoStack BD = new BrowserDemoStack();
		BD.launchBrowser();
		BD.userLogin();
		BD.productAddToCart();
		BD.userInfo();
		BD.orderSummary();
		driver.close();

	}

}
