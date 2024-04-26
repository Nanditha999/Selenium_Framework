package testbase;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.enterinsurancedataobjects;
import pageobjects.enterproductdataobjects;
import pageobjects.entervehicledatapageobjects;
import pageobjects.homepageobjects;
import resuablecomponents.propertiesoperation;

public class testbase extends eachpageobjects_Init {
	
	
	public static WebDriver driver;
	
	
	public void launchbrowser() throws Exception {
		
		//launch browser
		
		String browser=propertiesoperation.getpropertyvalue("browser");
		String URL=propertiesoperation.getpropertyvalue("url");
		
		if(browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if (browser.equalsIgnoreCase("ie")){
			WebDriverManager.iedriver().setup();
			driver=new EdgeDriver();
		
		}
		
		else if(browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		//navigate url
	}

	
	@BeforeMethod
	public void setup() throws Exception {  //It will executed before each test method within current class
		
		launchbrowser();
		
		//Initializing objects here so as soon as we launch browser we the driver objj, with that driver we can do
		homepage=new homepageobjects();
		vehicledata=new entervehicledatapageobjects();
		insData = new enterinsurancedataobjects();
		prodData = new enterproductdataobjects();  
	}
	
	
	@AfterMethod
	public void teardown()
	{
		
		driver.quit();
	}
}
