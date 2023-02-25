import java.io.IOException;
import java.nio.file.Paths;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


import practice_maven.baseclass;
import practice_maven.pom01;
import practice_maven.pom02;
import practice_maven.utilityClass;

public class TestClass extends baseclass {
	public ExtentHtmlReporter reporter;
    public ExtentReports extent;
    public ExtentTest test;
    pom01 obj1;
    pom02 obj2;
    
    @BeforeClass
    public void browser() throws IOException, InterruptedException {
    	openbrowser();
    	obj1=new pom01(driver);
    	obj2=new pom02(driver);
    	
    	reporter=new ExtentHtmlReporter(".//TestResult//report.html");
    	reporter.config().setDocumentTitle(Paths.get(System.getProperty("user.dir")).getFileName().toString());
    	reporter.config().setReportName("sample_report");
    	reporter.config().setTheme(Theme.DARK);
    	extent=new ExtentReports();
    	extent.attachReporter(reporter);
    	}
     @BeforeMethod
     public void credentialt() throws IOException, InterruptedException {
    	 obj1.username(utilityClass.file("USERNAME"));
    	 obj1.password(utilityClass.file("PASSWORD"));
    	 obj1.loginbutton();
    	 Thread.sleep(5000);
     }
     @Test
     public void manager() {
    	 test=extent.createTest("test start");
    	 System.out.println(obj2.Managerid());
    	 test.log(Status.INFO,"test case01");
     }
     @AfterMethod
     public void result(ITestResult result) throws IOException {
    	 if(result.getStatus()==ITestResult.SUCCESS) {
    		 test.log(Status.PASS,"TEST CASE PASS");
    		 test.addScreenCaptureFromPath(utilityClass.screenShot(driver, 11));
    	 }
    	 else {
    		 test.log(Status.FAIL,"TEST CASE FAIL");
    		 test.addScreenCaptureFromPath(utilityClass.screenShot(driver, 12));
    	 }
     }
     @AfterClass
     public void end() throws InterruptedException {
    	 closeBrowesr();
    	 extent.flush();
     }
}
