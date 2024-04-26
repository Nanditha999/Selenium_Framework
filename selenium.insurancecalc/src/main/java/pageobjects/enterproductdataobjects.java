package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.testbase;

public class enterproductdataobjects extends testbase {
	
	@FindBy(id="startdate")
	WebElement date_startdate;
	
	@FindBy(id="insurancesum")
	WebElement dd_insurancesum;
	
	@FindBy(id="damageinsurance")
	WebElement dd_damageinsurance;
	
	////optional products
	@FindBy(xpath = "//input[@name='Optional Products[]']/parent::label")
	List<WebElement> chk_optionalProducts;
	
	@FindBy(id="nextselectpriceoption")
	WebElement btn_Next;

	///init
	public enterproductdataobjects() {
	PageFactory.initElements(driver, this);
	}

	
	public void enterproductdata() {
		date_startdate.sendKeys("15/03/2000");
		cm.dropdown_Valuetoenter(dd_insurancesum, "6,000,00");
		cm.dropdown_Valuetoenter(dd_insurancesum, "6767667");
		cm.checkbox_selection(chk_optionalProducts, "euro protection");
		
		
	}
	
	public void clickonnxtbtn() {
		btn_Next.click();
		
	}
}
