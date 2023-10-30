package test_ng_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import PAge_object_model.getscreenshot;

public class Base_script {
	public  WebDriver driver;
@BeforeMethod
public void open_app()
{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
}
@AfterMethod
public void close_app(ITestResult result) 
{
	System.out.println(result);
	if(result.FAILURE==result.FAILURE)
	{
		getscreenshot.get_photo(driver);
	}
	if(result.SUCCESS==result.SUCCESS)
	{
		System.out.println("tc   is   pass");
	}
	driver.close();
}
}
