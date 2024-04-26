package resuablecomponents;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testbase.eachpageobjects_Init;

import java.text.SimpleDateFormat;
import java.util.Date;


public class  extent_reportsetup extends eachpageobjects_Init  {
	
	public static ExtentReports ext_setup() {
		
		
		//date attachimh to report
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-mm-yyyy  HH:MM:SS");
		Date date=new Date();
		String actual_date=dateformat.format(date);

		
		String reportlocation=System.getProperty("user.dir")+
				"/reports_screenshots/extentreport/"+actual_date+".html";
		
		//To define what kind of report(Cosmetic related)  we need, its available in website
		ExtentSparkReporter sparkreport=new ExtentSparkReporter(reportlocation);
		
		//creatring obect of extent reoprt
		 extent=new ExtentReports();
		
		//for the object created we are attaching the sparkreport to generate
		extent.attachReporter(sparkreport);
		
		//setting report title and theme
		sparkreport.config().setDocumentTitle("SELENIUM REPORT");
		sparkreport.config().setTheme(Theme.DARK);
		sparkreport.config().setReportName("THESIS");
		return extent;
	}
	

}
