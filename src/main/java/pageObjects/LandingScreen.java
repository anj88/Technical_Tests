package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingScreen {
	public WebDriver driver;
	
	By postcode=By.name("postcode");
	
	By searchbtn =By.xpath("//*[@id=\"skipToMain\"]/form/div/button/span");
	
	public LandingScreen(WebDriver driver)//Constructor 
	{
		this.driver=driver;
	}
	
	public WebElement enterPostcode()
	{
	return driver.findElement(postcode);	
	}
	public WebElement searchButton()
	{
		return driver.findElement(searchbtn);
	}

}
