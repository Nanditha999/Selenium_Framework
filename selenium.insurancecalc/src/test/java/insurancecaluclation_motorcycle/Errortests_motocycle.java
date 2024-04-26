package insurancecaluclation_motorcycle;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import testbase.testbase;

public class Errortests_motocycle extends testbase{
	
	
	@Test(enabled=false)
	public void errormsg_payloadfield() {
		
		//open browser and navigate--handled in test base@before method
		
		//Click on motorcycle--present on homepage object class
		homepage.clickOn_motorcycyclelink();
		
		//enter cyclindrical capacity--present in entervehicledata page object
		vehicledata.enterCylinderCapacity("12000");
		
		String actual_errormsg=vehicledata.getErrorMessageOnCylinderCapacity();
		String expected_errormsg=" dummy";
		
		//Assertions 
		Assert.assertEquals(actual_errormsg, expected_errormsg,"error msg is not as expected on page");
				
		
		
	}
	
	
	
	@Test(enabled=true)
	public void verifymodeldropdownlist() {
		
		//click on motocycle link
		homepage.clickOn_motorcycyclelink();
		List<String> actual_contents=vehicledata.getdropdownvalues();
		test.log(Status.INFO, "Actual content is"+actual_contents);
		List<String> expected_Contents=Arrays.asList("– please select –\", \"Scooter\", \"Three-Wheeler\", \"Moped\", \"Motorcycle");
		test.log(Status.INFO, "Actual content is"+expected_Contents);
		Assert.assertEquals(actual_contents, expected_Contents,"Expected content is"+expected_Contents);
	}
	

}
