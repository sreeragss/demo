package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scrolldown {
	WebDriver driver;
	
	@BeforeTest
	public void browseropen()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlopen()
	{
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//scroll by pixel
		//js.executeScript("window.scrollBy(0,12000)","");
		
		//scroll by element visible
		//js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\\\"navFooter\\\"]/div[5]/ul/li[2]/a")));
		
		//scroll by Bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
			
		driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[5]/ul/li[2]/a")).click();
	}

}
