package test_ng_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PAge_object_model.POM;

public class runner_script 
{
@Test(dataProvider = "test")
public void run(String un, String pwd) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys(un);
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys(pwd);
}

@DataProvider(name = "test")
public Object[][] test_data()
{
	return new Object[][] {
		{"prajwal","Hii"},
		{"qspiders","automation"}		
		
};
}







}
