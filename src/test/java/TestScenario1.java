import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.junit.Test;
import org.testng.annotations.*;
import org.testng.Assert;

import pageObjects.LandingScreen;
import pageObjects.RestaurantList;
import resources.base;

//Feature: Use the website to find restaurants
//So that I can order food
//As a hungry customer
//I want to be able to find restaurants in my area
//Adding Logs


public class TestScenario1 extends base {
	public static Logger log =LogManager.getLogger(base.class.getName());
	//Scenario 1: 
	@Test (priority=1 ,dataProvider="getData")	
	public void navigation(String post_code) throws IOException
	{
		driver=initializeDriver();
		log.info("Driver is initialised and navigated to the URL");
		driver.get(prop.getProperty("url"));
		LandingScreen l =new LandingScreen(driver);
		l.enterPostcode().sendKeys(post_code);
		l.searchButton().click();
		
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[1][1];
		data[0][0]="AR51 1AA";
		return data;
		
	}
	
	@Test (priority=2)	
	public void verifyRestaurant() throws IOException
	{
		RestaurantList r=new RestaurantList(driver);
	
		Assert.assertEquals((r.postalCode().getText()), "AR51 1AA, Area51");
		if(r.postalCode()!=null) {
		System.out.println("Element is Present");
		}else{
		System.out.println("Element is Absent");
		}
		System.out.println(r.searchresult().getText());
		log.info("Successfully validated that search results are show for the postcode");
	}
	
	@Test(priority=3)
	public void verifyTabs() throws IOException
	{
		RestaurantList r=new RestaurantList(driver);
		Assert.assertTrue(r.tabs().isDisplayed());
	}
	
	@Test (priority=4)	
	public void searchRestaurant() throws IOException, InterruptedException
	{	RestaurantList r1=new RestaurantList(driver);
		r1.searchRestaurant().sendKeys("tea");
		r1.searchButton().click();
		if(r1.searchresult2()!=null) {
			
			System.out.println("Element is Present");
			}else{
			System.out.println("Element is Absent");
			}
			System.out.println(r1.searchresult2().getText());
			
			
		}
	
	
	@Test (priority=5)	
	public void restaurantList() throws IOException, InterruptedException
	{	//new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.nsg-button"))).click();
		RestaurantList r=new RestaurantList(driver);
		String hotelname =r.restaurantlist().getText();
		System.out.println("hotel1"+hotelname);
		r.restaurantlist().click();
		//Verify if the restaurant show is same as the restaurant clicked
		String e =r.restaurantname().getText();
		//if (hotelname.equals(e))
		Assert.assertEquals(hotelname, e);
		//{
		//System.out.println("hotel2"+e);
		//}	
			
		
		
	}
}

	
	
	
	
