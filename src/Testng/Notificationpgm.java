package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Notificationpgm {
    WebDriver driver;
	@BeforeTest
	public void bowseropen()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");     //for disable notifications
		//options.addArguments("--remote-allow-origins=*");    //for issue with chrome browser
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		driver.get("https://www.justdial.com/");
	}

}
