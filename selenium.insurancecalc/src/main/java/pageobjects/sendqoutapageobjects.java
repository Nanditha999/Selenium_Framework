package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sendqoutapageobjects extends demo {
	
	@FindBy(id="email")
	WebElement txt_email;

	@FindBy(id="phone")
	WebElement txt_phone;
	
	@FindBy(id="username")
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(id="confirmpassword")
	WebElement txt_confirmpassword;
	
	@FindBy(id="Comments")
	WebElement txt_Comments;
	
	@FindBy(id="sendemail")
	WebElement btn_send;
	
	public sendqoutapageobjects() {
	PageFactory.initElements(driver, this);
	}

}
