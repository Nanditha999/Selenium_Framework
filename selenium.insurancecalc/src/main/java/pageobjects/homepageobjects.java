package pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.testbase;


public class homepageobjects extends testbase {
	//contains only page objects(locators) and respective methods

	

	@FindBy(id="nav_automobile")
	WebElement link_automobile;
	
	@FindBy(id="nav_truck")
	WebElement link_truck;
	
	@FindBy(id="nav_camper")
	WebElement link_camper;
	
	@FindBy(id="nav_motocycle")
	WebElement link_motocycle;
	
	public homepageobjects(){
		PageFactory.initElements(driver, this);
	}
	
	public void clickOn_motorcycyclelink() {
		 link_motocycle.click();
		
	}
}
