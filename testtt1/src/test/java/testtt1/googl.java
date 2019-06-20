package testtt1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class googl {
	public void testg() {
	System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.hdfcbank.com/");
	driver.manage().window().maximize();
	
	WebElement div=driver.findElement(By.id("SIvCob"));
	
	List<WebElement> list=div.findElements(By.tagName("a"));
	Assert.assertEquals(list.size(),9);
	
	}
	 
}
