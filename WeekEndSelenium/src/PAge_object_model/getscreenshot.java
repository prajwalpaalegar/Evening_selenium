package PAge_object_model;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class getscreenshot {
	
	public static void get_photo(WebDriver driver)
	{
		Date d=new Date();
		String da = d.toString();
		String dat = da.replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tmp = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("./photo/"+dat+".jpg");
		try {
			FileHandler.copy(tmp, dst);
		} catch (IOException e) {
			System.out.println("photo not captured");
		}
	}
	
}
