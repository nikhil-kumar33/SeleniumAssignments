package seleniumAssignments3;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Assignment1 {
	WebDriver driver;
	static ExtentTest test;
	static ExtentReports report;
	
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Documents\\eclipse jar files\\drivers\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
	  driver.get("https://www.google.co.in");
	  
	  if(driver.getTitle().equals("Google"))
	  {
	  test.log(LogStatus.PASS, "Navigated to the specified URL");
	  }
	  else
	  {
	  test.log(LogStatus.FAIL, "Test Failed");
	  }
	  }
	
  
  @BeforeMethod
  public void beforeMethod() {
	  report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
	  test = report.startTest("Assignment1");
	  
	  
	 
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  report.endTest(test);
	  report.flush();
  }

}
