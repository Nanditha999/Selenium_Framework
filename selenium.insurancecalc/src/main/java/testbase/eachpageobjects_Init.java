package testbase;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageobjects.enterinsurancedataobjects;
import pageobjects.enterproductdataobjects;
import pageobjects.entervehicledatapageobjects;
import pageobjects.homepageobjects;
import pageobjects.selectpriceoptionsobjects;
import resuablecomponents.Common_Methods;

public class eachpageobjects_Init  {
	
	

	public static WebDriver driver;
	public static homepageobjects homepage;
	public static entervehicledatapageobjects vehicledata;
	public static ExtentReports extent;
	public static ExtentTest test;
	public  Common_Methods cm=new Common_Methods();
	public static enterinsurancedataobjects insData;
	public static enterproductdataobjects prodData;
	public static selectpriceoptionsobjects selectprice;
}
