package seleniumAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Assignment9 {
	WebDriver driver;
  @Test
  public void test() throws InterruptedException, IOException {
	  
	  FileInputStream fis= new FileInputStream("C:\\workspace1\\SeleniumAssignments\\src\\main\\java\\seleniumAssignments\\config.properties");
	  Properties prop = new Properties();
	  prop.load(fis);
	  System.out.println(prop.getProperty("username"));
	  System.out.println(prop.getProperty("password"));
	  System.out.println(prop.getProperty("url"));
	  driver.get(prop.getProperty("url"));
	  
}
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Documents\\eclipse jar files\\drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	 
	  
  }
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.quit();
  }
 
}
