package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.testbase;

public class enterinsurancedataobjects extends testbase {
	
	@FindBy(id="firstname")
	WebElement txt_firstname;
	
	@FindBy(id="lastname")
	WebElement txt_lastname;
	
	@FindBy(id="birthdate")
	WebElement date_birthdate;
	
	/////gender
	@FindBy(xpath = "//input[@name='Gender']/parent::label")
	List<WebElement> rdo_Gender;
	
	@FindBy(id="country")
	WebElement dd_country;
	
	
	@FindBy(id="zipcode")
	WebElement txt_zipcode;
	
	@FindBy(id="city")
	WebElement txt_city;
	
	@FindBy(id="occupation")
	WebElement dd_occupation;
	
	////hobbies
	@FindBy(xpath = "//input[@name='Hobbies']/parent::label")
	List<WebElement> chk_hobbies;
	
	@FindBy(id="website")
	WebElement txt_website;
	
	@FindBy(id="open")
	WebElement btn_PictureOpenButton; 
	
	@FindBy(id="nextenterproductdata")
	WebElement btn_Next;

	public enterinsurancedataobjects() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterinsurancedata() {
		
		txt_firstname.sendKeys("Omsai");
		txt_lastname.sendKeys("Ram");
		date_birthdate.sendKeys("18/03/1999");
		cm.selectradiobutton(rdo_Gender, "Male");	
		cm.dropdown_Valuetoenter(dd_country,"India");
		txt_zipcode.sendKeys("Insurant_zipcode");
		cm.dropdown_Valuetoenter(dd_occupation,"Teaccher");

		//Select checkboxes for hobbies
		cm.checkbox_selection(chk_hobbies, "speeding,Jogging");		
		
	}

	public void clickOnNextButton() {
		btn_Next.click();
	}
	}


