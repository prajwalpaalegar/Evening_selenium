 package PAge_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {

	//declare
	@FindBy(id = "email")
	private WebElement ele;
	//init
	public POM(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//utili
	public WebElement enter_un()
	{
		return ele;
	}	
}
