package testtt1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demo4 {
@Test
	public void testGoogleHomePage()
{
	System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://google.co.in/");
	driver.manage().window().maximize();
	String title=driver.getTitle();
			Assert.assertEquals(title,"Google");
}
}
