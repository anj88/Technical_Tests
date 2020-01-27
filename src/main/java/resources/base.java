package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class base {
	public WebDriver driver;
	public Properties prop = new Properties();

	public WebDriver initializeDriver() throws IOException {
		
		
	
		FileInputStream fis =new FileInputStream("C:\\Users\\Joe\\eclipse-workspace\\JustEat1\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if (browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Joe\\eclipse-workspace\\chromedriver.exe");	
		driver = new ChromeDriver();
		
		
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
		
			
		
	}
	
	
	
}
