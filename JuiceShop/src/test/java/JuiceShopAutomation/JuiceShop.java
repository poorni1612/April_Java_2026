package JuiceShopAutomation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class JuiceShop {
	static ChromeDriver driver=new ChromeDriver();
void createUser()
{WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	WebElement cookieDismiss = wait.until( ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@aria-label, 'dismiss')]"))
        );
	cookieDismiss.click();
	//alert.dismiss();
	driver.findElement(By.xpath("//div[@class='mat-mdc-text-field-wrapper mdc-text-field mdc-text-field--outlined']")).sendKeys("Adams");}

void logIn()
{
	
	
}
void addItems()
{
	
}
void checkOut()
{
	
}
void couponFailing()
{
	
}
void logOut()
{
	
}
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		//options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		driver.get("https://juice-shop.herokuapp.com/#/register");
		
		
		
		

	}

}
