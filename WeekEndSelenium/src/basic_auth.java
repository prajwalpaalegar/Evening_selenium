import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class basic_auth {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--start-maximized");
	WebDriver driver=new ChromeDriver(opt);
	driver.get("file:///C:/Users/QSPR/Desktop/file.html");
	Thread.sleep(2000);
	Runtime.getRuntime().exec("C:\\Users\\QSPR\\Desktop\\autoit\\flieupload.exe");
	
	
	
}
}
