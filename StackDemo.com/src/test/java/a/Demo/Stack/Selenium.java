package a.Demo.Stack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium {
	EdgeDriver driver;

	void addProducts(ArrayList<String> productList) throws InterruptedException {
		for (String product : productList) {
			driver.findElement(By.xpath("//p[contains(text(),'" + product + "')]/../div[@class='shelf-item__buy-btn']"))
					.click();
		}
		driver.findElement(By.xpath("//div[@class='buy-btn']")).click();
	}

	void launchBrowserStack() {
		driver = new EdgeDriver();
		driver.get("https://bstackdemo.com/signin");
		driver.manage().window().maximize();
	}

	void enterCredentials() {
		// //div[@id='username'] ---> xpath for user name text box
		// using attribute id
		// //div[@class=' css-2b097c-container'][1]
		// ---> xpath for user name text box with out using attribute id
		driver.findElement(By.xpath("//div[@class=' css-2b097c-container'][1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'demouser')]")).click();
		driver.findElement(By.xpath("//div[@class=' css-2b097c-container'][2]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'testingisfun99')]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	int checkOutandReturnOrderNo() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@autocomplete='given-name']")).sendKeys("First Name");
		driver.findElement(By.xpath("//input[@autocomplete='family-name']")).sendKeys("Last name");
		driver.findElement(By.xpath("//input[@autocomplete='address-line1']")).sendKeys("House number ,Street , Town");
		driver.findElement(By.xpath("//input[@autocomplete='address-level1']")).sendKeys("State");
		driver.findElement(By.xpath("//input[@autocomplete='postal-code']")).sendKeys("01721");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		return Integer.parseInt(driver.findElement(By.xpath("//div/strong")).getText());
	}

	void closeDriver() {
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {

		ArrayList<String> products = new ArrayList<String>();
		
		Selenium bsw = new Selenium();
		products.add("iPhone 12 Mini");
		products.add("iPhone 12 Pro Max");
		products.add("iPhone 12");
		products.add("iPhone 12 Pro");
		products.add("Pixel 3");
		//products.add("iPhone XS");
		// products.add("iPhone XR");
		// products.add("iPhone XS Max");
		// products.add("Galaxy S20 Ultra");
		products.add("Galaxy S10");
		products.add("One Plus 8 Pro");
		products.add("One Plus 8T");
		bsw.launchBrowserStack();
		bsw.enterCredentials();
		Thread.sleep(1000);
		bsw.addProducts(products);
		System.out.println("Order number for this order is " + bsw.checkOutandReturnOrderNo());
		bsw.closeDriver();
	}

}