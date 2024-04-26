package resuablecomponents;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Common_Methods {
	
	//common method to select DD value
	public void dropdown_Valuetoenter(WebElement element,String valuetobeselected) {
		
		Select os=new Select(element);
		os.selectByVisibleText(valuetobeselected);
	}
	
	
	public List<String> getdropdownlistvalues(WebElement element) {
		
		Select sc=new Select(element);
		List<WebElement> listt=sc.getOptions();
		List<String> actual_values=new ArrayList<String>();
		
		for(WebElement ele:listt) {
			
			actual_values.add(ele.getText());
		}
		return actual_values;
	}
	//radio
	public void selectradiobutton(List<WebElement> wb, String valuetobeselected)
	{
		for(WebElement el: wb) {
			//Always we need to extract text from webelement
			if (el.getText().equals(valuetobeselected)){
				el.click();
				break;
			}
		}
	}
	
	//common method for checkbox
	public void checkbox_selection(List<WebElement> element, String check){
		String[] cc=check.split(",");
		for(String val:cc) {
			for(WebElement el:element) {
				el.getText().equalsIgnoreCase(val);
				el.click();
				break;
			}
		}
			}
		
		
	}

	
	

