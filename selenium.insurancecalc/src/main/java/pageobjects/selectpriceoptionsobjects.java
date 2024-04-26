package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.testbase;

public class selectpriceoptionsobjects extends testbase {
	
	@FindBy(id="nextsendquote")
	WebElement btn_Next;
	
	//init
	public selectpriceoptionsobjects() {
		PageFactory.initElements(driver, this);
	}
	//method to get price based on scheme
	public String getpriceforselectedoption(String scheme) {
		String dataxpath="//table[@id='priceTable']//tr[1]//td[@data-label='"+scheme+"']/span";
		return driver.findElement(By.xpath(dataxpath)).getText();	}

	
	public void selectpriceopt_Radiobtn(String plan) {
		String rdxpath="//input[@name='Select Option' and @value='"+plan+"']/parent::label";
		driver.findElement(By.xpath(rdxpath)).click();
		
		
	}
	public void clickonnxtbtn() {
		btn_Next.click();
	}
}
