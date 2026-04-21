package testingAutomation.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BstackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://bstackdemo.com/signin");
		WebElement username=driver.findElement(By.xpath("//*[contains(text(),'Select Username')]"));
		username.click();
		driver.findElement(By.xpath("//div[contains(text(),'demouser')]")).click();
		
		

	}

}
