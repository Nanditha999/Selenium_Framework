package insurancecaluclation_motorcycle;

import java.io.IOException;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resuablecomponents.Exceloperations;
import testbase.testbase;

public class endtoendtests_Motocycle extends testbase{
	
	Exceloperations exc=new Exceloperations("Insurancepremium");
	

	
	
	@Test(dataProvider="datasupplier")
	public void insurancecalculator(Object obj1) throws Exception {
		
		HashMap<String,String> testdata=(HashMap<String, String>) obj1;
		
		homepage.clickOn_motorcycyclelink();
		vehicledata.enter_vehicle_details();
		vehicledata.clickOnNextButton();
		insData.enterinsurancedata();
		insData.clickOnNextButton();
		prodData.enterproductdata();
		prodData.clickonnxtbtn();
		
		
		String expected="333.3";
		String actual=selectprice.getpriceforselectedoption("silver");
		Assert.assertEquals(expected, actual);
		
		selectprice.selectpriceopt_Radiobtn("silver");
		selectprice.clickonnxtbtn();
		
		
		
	}
	
	
	//Data provider method==return type should always be OBJECT ARRAY
	
	@DataProvider(name="datasupplier")
	public Object [][] testdatadataprovider() throws IOException{
		
		Object[][] obj=new Object[3][1];
		for (int i=1;i<=exc.getrowcount();i++) {
			HashMap<String,String> testdata=exc.gettestdatainmap(i);
			obj[i-0][0]=testdata;
		}
		return obj;
		
		
	}
	

}
