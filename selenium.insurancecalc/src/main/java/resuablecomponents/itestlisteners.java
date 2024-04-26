package resuablecomponents;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import testbase.eachpageobjects_Init;

public class itestlisteners extends eachpageobjects_Init implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		//before each test case
		test=extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "test case:"+result.getMethod().getMethodName()+ "is passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.PASS, "test case" + result.getMethod().getMethodName()+"is failed");
		test.log(Status.FAIL, result.getThrowable());
		
		//Add screenshot for failed TCs
		
		(Takescreenshot(driver)).getscreenshotas(OutputType.FILE);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		//setup extend method call
		
		extent=extent_reportsetup.ext_setup();
	}
		
	

	@Override
	public void onFinish(ITestContext context) {
		//Closing extent report
		extent.flush();
	}

}
