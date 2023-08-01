package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Practise.Evolvelove;
public class Extentreport implements ITestListener {
	public ExtentSparkReporter  sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	String repName;
	
//	package org.testng;
//	public interface ITestListener extends ITestNGListener {
@Test
public void onStart(ITestContext context) {
	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()); // time stamp
	repName = "Test-Report-" + timeStamp + ".html";
	
	sparkReporter = new ExtentSparkReporter(".\\reports\\" + repName); // specify location of report 
	sparkReporter.config().setDocumentTitle("Evolving report"); // title of report 
	sparkReporter.config().setReportName("Evolving Love testing"); // name of report
	sparkReporter.config().setTheme(Theme.STANDARD);
	
	extent = new ExtentReports();
	extent.attachReporter(sparkReporter);
	extent.setSystemInfo("application", "love");
	extent.setSystemInfo("operating system", System.getProperty("os.name"));
	extent.setSystemInfo("User name", System.getProperty("user.name"));
  }
public void onTestSuccess(ITestResult result) {
    test = extent.createTest(result.getName());
    test.log(Status.PASS,"Test passed" );
  }
 public void onTestStart(ITestResult result) {
 }
 public void onTestFailure(ITestResult result) {
	 test = extent.createTest(result.getName());
	 test.log(Status.FAIL,"Test failed" );
	 test.log(Status.FAIL, result.getThrowable().getMessage());
	/* try {
		 String imgpath = new BaseClass().captureScreen(result.getName());
	 } */    
  }
  public void onFinish(ITestContext context) {
	  extent.flush();
  }
}



