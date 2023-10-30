package demo;

import org.testng.annotations.Test;

public class Sample extends BaseClass
{
	@Test
	public void test() throws InterruptedException
	{
		
		Pom p=new Pom(driver);
		p.Login();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.Login();
		
		
	}
}
