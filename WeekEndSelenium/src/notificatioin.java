import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class notificatioin {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--headless");
	WebDriver driver =new ChromeDriver(opt);
	driver.get("https://www.flipkart.com");
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	int count = links.size();
	for (WebElement link : links) {
		String text = link.getText();
		System.out.println(text);
	}
	
	
	
}
}
