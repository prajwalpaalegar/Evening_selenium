package demo;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass implements BaseConstans
{
	public WebDriver driver;
	@BeforeMethod
	public void oppApp()
	{
		System.setProperty(chromekey,chromevalue );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
	}
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}
//ok
}
