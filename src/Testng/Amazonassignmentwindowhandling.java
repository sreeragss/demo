package Testng;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonassignmentwindowhandling {
	WebDriver driver;
	
	@BeforeTest
	public void browseropen()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	
	public void urlopen()
	{
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void test()
	{
		String parentWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a")).click();
		
		Set<String> allwindowhandles = driver.getWindowHandles();
		for(String handle:allwindowhandles)
		{
			System.out.println(handle);
			
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]/span[2]")).click();
				driver.close();
			}
			
			driver.switchTo().window(parentWindow);
			
		}
		
		
		
	}

}
