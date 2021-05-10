package seleniumAssignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Assignment5 {
	WebDriver driver;
  @Test
  public void test() {
	  JavascriptExecutor scroll= (JavascriptExecutor)driver;
	  scroll.executeScript("window.scrollBy(0,250)", "");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Documents\\eclipse jar files\\drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	 // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.quit();
  }

}
