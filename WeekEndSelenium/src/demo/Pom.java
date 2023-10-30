package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom 
{
	//Dec
	@FindBy(xpath="//button[.='Log in']")
	private WebElement LG;
	//ini
	public Pom(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	//Uti
	public void  Login()
	{
		LG.click();
	}
}
