package testingAutomation.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingAutomation {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/");
		driver.findElement(By.xpath("//a[text()='Practice']")).click();
		driver.findElement(By.xpath("//a[text()='Test Login Page']")).click();
		WebElement Username=driver.findElement(By.xpath("//input[@name='username']"));
		Username.sendKeys("student");
		WebElement Password=driver.findElement(By.xpath("//input[@name='password' or @id='password']"));
		Password.sendKeys("Password123");
		driver.findElement(By.xpath("//Button[text()='Submit']")).click();
		
		
		
		
		
	}

}
