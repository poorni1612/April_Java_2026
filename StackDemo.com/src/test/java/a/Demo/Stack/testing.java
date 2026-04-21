package a.Demo.Stack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class testing{

	

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			driver.get("https://bstackdemo.com/signin");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			WebElement UserEle = driver.findElement(By.xpath("//div[text()='Select Username']"));
			UserEle.click();
			WebElement SelUser= driver.findElement(By.xpath("//div[@id='username']//div[text()='demouser']"));
			SelUser.click();
	        WebElement PassEle= driver.findElement(By.xpath("//div[text()='Select Password']"));
	        PassEle.click();
	        WebElement PassSel = driver.findElement(By.xpath("//div[@id='password']//div[text()='testingisfun99']"));
	        PassSel.click();
	        WebElement LoginBtn = driver.findElement(By.xpath("//button[@id='login-btn']"));
	        LoginBtn.click();
	        WebElement IphoneBtn=driver.findElement(By.xpath("//div[@class='filters']//div[1]/label/span[text()='Apple']"));
	        IphoneBtn.click();
	        ////div[@class='filters']//div[4]/label/span[text()='OnePlus']
	        WebElement Iphone12Btn=driver.findElement(By.xpath("//div[@id='1']//div[text()='Add to cart']"));
		    Iphone12Btn.click();
		    WebElement Iphone11ProBtn = driver.findElement(By.xpath("//div[@id='6']//div[text()='Add to cart']"));
		    Iphone11ProBtn .click();
		    WebElement CheckOutBtn = driver.findElement(By.xpath("//div[@class='buy-btn']"));
		    CheckOutBtn.click();
		    Thread.sleep(10000);
		   WebElement FirstName = driver.findElement(By.id("firstNameInput"));
		   FirstName.sendKeys("dd");
		   WebElement LastName = driver.findElement(By.id("lastNameInput"));
		   LastName.sendKeys("ee");
		   WebElement AddressEle = driver.findElement(By.id("addressLine1Input"));
		   AddressEle.sendKeys("abcdefghijk");
		   WebElement ProvinceEle = driver.findElement(By.id("provinceInput"));
		   ProvinceEle.sendKeys("NY");
		   WebElement PostalEle = driver.findElement(By.id("postCodeInput"));
		   PostalEle.sendKeys("2345678");
		   WebElement SubmitBtn = driver.findElement(By.id("checkout-shipping-continue"));
		   SubmitBtn.click();
		   Thread.sleep(2000);
		   WebElement PrintOut = driver.findElement(By.xpath("//div[@class='checkout-form']//div[contains(text(),'Your order ')]"));
		   System.out.println(PrintOut.getText());
		   WebElement ContinueBtn = driver.findElement(By.xpath("//div[@class='continueButtonContainer']/a/button[text()='Continue Shopping »']"));
		   ContinueBtn.click();
		   Thread.sleep(10000);
		  
		}
		
		

	}