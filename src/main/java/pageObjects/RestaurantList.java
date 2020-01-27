package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RestaurantList {

		public WebDriver driver;
		//objects
		By postalcode=By.xpath("//div[@class='c-locationHeader u-showAboveMid']//h1[@class='c-locationHeader-title'][contains(text(),'AR51 1AA, Area51')]");
		By searchresult=By.xpath("//span[contains(text(),'open restaurants')]");	
		By searchbar =By.xpath("//*[@id='dish-search']");
		By searchbutton=By.xpath("//button[@type='submit']");
		By searchresult2=By.xpath("//span[contains(text(),'restaurants')]");
		By firstrestaurant=By.xpath("/html[1]/body[1]/main[1]/main[1]/div[1]/div[2]/div[4]/div[1]/div[1]/section[1]/a[1]/div[3]/h3[1]");
		By restaurantname =By.xpath("//*[@class='name']");
		By tabs =By.xpath("//div[@class='u-showAboveMid']//div[@class='header-filters c-overflowCarousel-content c-intent-slide--mid']");
		public RestaurantList(WebDriver driver)//Constructor 
		{
			this.driver=driver;
		}
		
//methods	

		public WebElement postalCode()
		{
		new WebDriverWait(driver,100).until(ExpectedConditions.elementToBeClickable(postalcode));
		//element= wait.until(ExpectedConditions.elementToBeClickable(postalcode));
		return driver.findElement(postalcode);	
		}
		public WebElement tabs()
		{
			return driver.findElement(tabs);
		}
		
		public WebElement searchresult()
		{
			return driver.findElement(searchresult);
		}
		
		public WebElement searchRestaurant()
			
		{	//element=wait.until(ExpectedConditions.elementToBeClickable(searchbar));
			return driver.findElement(searchbar);
		}
		
		public WebElement searchButton() {
			new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(searchbutton));
			return driver.findElement(searchbutton);
		}
		
		public WebElement searchresult2()
		{
			return driver.findElement(searchresult2);
		}
		
		public WebElement restaurantlist()
		{
			return driver.findElement(firstrestaurant);
		}
		
		public WebElement restaurantname()
		{
			return driver.findElement(restaurantname);
		}
}


