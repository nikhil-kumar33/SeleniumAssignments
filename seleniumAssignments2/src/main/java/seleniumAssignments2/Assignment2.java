package seleniumAssignments2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class Assignment2 {
	WebDriver driver;
  @Test
  public void test() throws InterruptedException {
	 driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]/a")).click(); 
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]/a")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"search_type\"]")).click();
	 new Select(driver.findElement(By.xpath("//*[@id=\"search_type\"]"))).selectByIndex(2);
	 driver.findElement(By.xpath("//*[@id=\"search_patient\"]")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Documents\\eclipse jar files\\drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.quit();
  }

}
