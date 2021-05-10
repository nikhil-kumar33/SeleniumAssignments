package seleniumAssignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Assignment3 {
	WebDriver driver;
  @Test
  public void test() throws InterruptedException {
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[3]/div[1]/div[1]/ul/li[1]/a/img")).click();
	  Thread.sleep(2000);
	 Set<String> handles= driver.getWindowHandles();
	 System.out.println(handles.size());
	 for(String handle: handles) {
		System.out.println(driver.switchTo().window(handle).getTitle());
	     Thread.sleep(1000);}
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Documents\\eclipse jar files\\drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	 // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://www.naukri.com/");
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.quit();
  }

}
