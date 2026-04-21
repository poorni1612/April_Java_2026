
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class TutorialsNinja {
	static FirefoxDriver driver = new FirefoxDriver();

//1>Launch the Application
	void launchBrowser() {

		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("-private");
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();

	}

//2. Select the currency in the left top corner to Euro
	void changeCurrency() throws InterruptedException {

		WebElement Currency = driver.findElement(By.xpath("//*[@class='btn btn-link dropdown-toggle']"));

		Currency.click();

		List<WebElement> Ele = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));

		for (WebElement curr : Ele) {
			String temp_currency = curr.getText();
			System.out.println("In For block");

			if (temp_currency.equalsIgnoreCase("€Euro")) {
				curr.click();
				System.out.println("Currency" + temp_currency + "is selected");
				break;

			}
		}
	}

//3. Try to order a canon EOS 5 D camera and collect the error message occurred due to a
//bug in select option by clicking add to cart.
	void orderCanon() {
		driver.findElement(By.xpath("//a[contains(text(),'Canon EOS 5D')]")).click();
		WebElement AddToCartBtn = driver.findElement(By.xpath("//button[@id='button-cart']"));
		AddToCartBtn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String ErrorMsg = driver
				.findElement(By.xpath(
						"//div[@class='form-group required has-error']//div[contains(text(),'Select required!')]"))
				.getText();
		System.out.println("Application Throws following error msg :" + ErrorMsg);

	}

	// 4. Move to the home screen by clicking the home icon, Click on iphone and go
	// to details screen, change the quantity to two then add to cart.
	void addIphone() throws Exception {
		// navigate to home page by pressing HomeIcon
		driver.findElement(By.xpath("//a[contains(text(),'Qafox.com')]")).click();
		// Navigate to Iphone Details page by clicking Iphone
		driver.findElement(By.xpath("//a[contains(text(),'iPhone')]")).click();
		WebElement Quantity = driver.findElement(By.xpath("//input[@name='quantity']"));
		Quantity.clear();
		Quantity.sendKeys("2");
		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		// Thread.sleep(1500);
		// 5. Print the success message in the
		// consoledriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String Message = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"))
				.getText();
		System.out.println(Message);
//6. Click on the cart icon (black color) in the right side top then click view cart
//7. Change the quantity of iphone to 3 and click update button
		driver.findElement(By.xpath("//span[@id='cart-total']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[contains(text(),'View Cart')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Quan = driver.findElement(By.xpath("//input[@type='text' and @value='2']"));
		Quan.clear();
		Quan.sendKeys("3");
		driver.findElement(By.xpath("//button[@data-original-title='Update']")).click();
		System.out.println("Updation Successful!!");
		Thread.sleep(2000);
	}

	public static void main(String[] args) throws Exception {

		TutorialsNinja ninja = new TutorialsNinja();
		ninja.launchBrowser();
		ninja.changeCurrency();
		ninja.orderCanon();
		ninja.addIphone();
		driver.quit();

	}

}
