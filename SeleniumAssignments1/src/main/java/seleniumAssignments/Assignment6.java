package seleniumAssignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Assignment6 {
	WebDriver driver;
  @Test
  public void test() throws InterruptedException{
	  
	 //Create object of Dimensions class
      Dimension dm = new Dimension(450,630);
      //Setting the current window to that dimension
      driver.manage().window().setSize(dm);
      }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Documents\\eclipse jar files\\drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	 driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.quit();
  }

}
