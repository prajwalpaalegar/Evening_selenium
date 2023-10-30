package gen_report;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class exten_repor {
	@Test
	public void run() 
	{
		ExtentReports report=new ExtentReports("./reports/extent.html");
		ExtentTest strt = report.startTest("testcase1");
		
		strt.log(LogStatus.PASS, "tc is pass");
		strt.log(LogStatus.FAIL, "tc is fail");
		strt.log(LogStatus.SKIP, "tc is skipped");
		
		report.endTest(strt);
		report.flush();--
		
		
		
		
		
	}
}
