package Extent_Screenshot;

import java.io.IOException;


import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ScreenShot_ExtentReport {

	@Test
	public void LoginTest() throws IOException
	{
		System.out.println("Login to amazon");
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Report_Screenshot/learn_automation1.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        ExtentTest logger=extent.createTest("LoginTest");
        logger.log(Status.INFO, "Login to amazon"); 
        logger.log(Status.PASS, "Title verified");
	    logger.pass("Pass as everthing is correct", MediaEntityBuilder.createScreenCaptureFromPath("E:/Picture/Tree.jpg").build());
        extent.flush();
        ExtentTest logger2=extent.createTest("Logoff Test");
	    logger2.log(Status.FAIL, "Title verified");
	    logger2.fail("Failed because of some issues", MediaEntityBuilder.createScreenCaptureFromPath("E:/Picture/2454901.jpg").build());

//	    logger2.addScreenCaptureFromPath("C:/Users/Manish Purwar/Desktop/download.jpg");
	    extent.flush();
	    
	}

}
