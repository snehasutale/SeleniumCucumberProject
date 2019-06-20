package testtt1;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demo6 {
@Test
	public void testGoogleHomePage()
{
	System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Register")).click();
	String title=driver.getTitle();
			Assert.assertTrue(title.contains("Register"));
					driver.findElement(By.id("gender-male")).click();
					driver.findElement(By.id("FirstName")).sendKeys("rohit");
					driver.findElement(By.id("LastName")).sendKeys("sutale");
					driver.findElement(By.id("Email")).sendKeys("rohitsutale@gmail.com");
					driver.findElement(By.id("Password")).sendKeys("sutale123");
					driver.findElement(By.id("ConfirmPassword")).sendKeys("sutale123");
					driver.findElement(By.cssSelector("input[value='Register']")).click();
					boolean flag=driver.findElement(By.cssSelector("input[value='Continue']")).isDisplayed();
							Assert.assertTrue(flag);
							driver.findElement(By.linkText("Log out")).click();
						driver.close();
		
}
}