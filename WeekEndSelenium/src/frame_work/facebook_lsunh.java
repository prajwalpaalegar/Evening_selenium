package frame_work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebook_lsunh implements frame_constant
{
@Test
public void run() throws InterruptedException {
	System.setProperty(chrome_key,chrome_value);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(fb_url);
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys(username);
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys(password);
	Thread.sleep(2000);
	driver.close();
	
}
}
