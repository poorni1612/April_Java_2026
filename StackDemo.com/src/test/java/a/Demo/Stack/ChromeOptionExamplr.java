package a.Demo.Stack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;

public class ChromeOptionExamplr {
	 static ChromeDriver driver=new ChromeDriver();
	
	
//    int launchBrowser()
//    {
//    	driver.get("https://www.numpyninja.com/");
//    	driver.manage().window().maximize();
//    	String name = null;
//    	List<WebElement> Element=driver.findElements(By.tagName("a"));
//    	for(WebElement link: Element)
//    	{
//    		name=link.getText();
//    		System.out.println(name);
//   	if(link.getText().equalsIgnoreCase("About Us"))
//   		//link.click();
//	System.out.println("Link"+name+"is present");}
//    	
//    	
//		
//    
//    	
//    	return Element.size();
//    	    }
    void testDropDown()
    {
    	driver.get("https://cosmocode.io/automation-practice/");
    	driver.manage().window().maximize();
    	List <WebElement> dropdown=driver.findElements(By.xpath("//select[@name='age'/option]"));
    	for(WebElement Ele : dropdown) {
    		if(Ele.getText().equalsIgnoreCase("under 30"))
    		Ele.click();
    			
    	}
    }
    public static void main(String[] args) {
    	
        ChromeOptionExamplr c = new ChromeOptionExamplr();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--incognito");
       //c.launchBrowser();
        
//        int size=c.launchBrowser();;
//        System.out.println("The number of links in the page"+size);
//        driver.quit();
        c.testDropDown();
        driver.quit();
        
    }
}


