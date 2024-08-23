package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Datadriven {
	WebDriver driver;
	
	@BeforeTest
	public void browseropen()
	{
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void urlopen()
	{
		driver.get("https://www.facebook.com");
	}

}
