package seleniumAssignments2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Assignment3 {
	WebDriver driver;
	
  @Test
  public void test() throws IOException {
	  
	  JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
	  String zoomInJS = "document.body.style.zoom='30%'"; 
	  jsExecutor.executeScript(zoomInJS);
	  
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(scrFile, new File("C:\\Users\\Laptop\\Documents\\screenshots\\Image.png"));

}
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Documents\\eclipse jar files\\drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://api.jquery.com/dblclick/");
  }

  @AfterMethod
  public void afterMethod() throws Exception {
	  Thread.sleep(1000);
	  driver.quit();
  }

}
