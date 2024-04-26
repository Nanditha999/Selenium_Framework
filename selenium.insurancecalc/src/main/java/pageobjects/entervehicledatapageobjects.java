package pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testbase.testbase;

public class entervehicledatapageobjects extends testbase {

	@FindBy(id="make")
	WebElement dd_make;

	@FindBy(id="model")
	WebElement dd_model;
	
	
	@FindBy(xpath="//input[@id='cylindercapacity']")
	WebElement txt_cylindercapacity;
	
	@FindBy(xpath = "//input[@id='cylindercapacity']/following-sibling::span[@class='error']")
	WebElement error_cylinderCapacity;

	@FindBy(id="engineperformance")
	WebElement txt_engineperformance;

	@FindBy(id="dateofmanufacture")
	WebElement date_dateofmanufacture;

	@FindBy(id="numberofseatsmotorcycle")
	WebElement dd_numberofseats;

	@FindBy(id="listprice")
	WebElement txt_listprice;

	
	@FindBy(id="annualmileage")
	WebElement txt_annualmileage;

	@FindBy(id="nextenterinsurantdata")
	WebElement btn_Next;
	
	//init
	    public entervehicledatapageobjects() {
		PageFactory.initElements(driver, this);
	}
		public void enterCylinderCapacity(String cylinderCap) {
			txt_cylindercapacity.sendKeys(cylinderCap);
		}

		public String getErrorMessageOnCylinderCapacity() {
			return error_cylinderCapacity.getText();
		}
		
		public String geterrormsg() {
			 String errormsg=error_cylinderCapacity.getText();
			 return errormsg;
			
		}
		public List<String> getdropdownvalues() {
			 return cm.getdropdownlistvalues(dd_make);
		}
		
		public void enter_vehicle_details() {
			cm.dropdown_Valuetoenter(dd_make, "BMW");
			cm.dropdown_Valuetoenter(dd_model, "moped");
			txt_cylindercapacity.sendKeys("333");
			txt_engineperformance.sendKeys("234");
			date_dateofmanufacture.sendKeys("Vehicle_Date of Manufacture");
			cm.dropdown_Valuetoenter(dd_numberofseats,"2");
			txt_listprice.sendKeys("Vehicle_List Price");
			txt_annualmileage.sendKeys("Vehicle_Annual Mileage");
		}
		
		public void clickOnNextButton() {
			btn_Next.click();
		}
		}
		
	
	

	
	
	


