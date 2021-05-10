package seleniumAssignments3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Assignment2 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void test(String s) throws InterruptedException {
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"qsb-keyword-sugg\"]")).sendKeys(s);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Documents\\eclipse jar files\\drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://www.naukri.com/");
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.quit();
	  
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "nikhil" },
      new Object[] { "kumar" },
    };
  }
}
