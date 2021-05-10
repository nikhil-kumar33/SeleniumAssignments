package seleniumAssignments2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Assignment1 {
	WebDriver driver;
  @Test
  public void test() {
	  WebElement firstName= driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
	  WebElement lastName= driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
	  WebElement userName= driver.findElement(By.xpath("//*[@id=\"username\"]"));
	  WebElement password= driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input"));
	  WebElement confirm= driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input"));
	  
	  if(firstName.getAttribute("type").equals("text")&& lastName.getAttribute("type").equals("text")) {
		  firstName.sendKeys("cat");
		  lastName.sendKeys("johnson");
		 }
	  
	  if(userName.getAttribute("type").equals("email"))
		  userName.sendKeys("catIsGreat1234567890");
	  
	  if(password.getAttribute("type").equals("password")&&confirm.getAttribute("type").equals("password")) {
		  password.sendKeys("john@123456");
		  confirm.sendKeys("john@123456");
	  }
	  
	  driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/div[2]")).click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Documents\\eclipse jar files\\drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://accounts.google.com/signup");
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.quit();
  }

}
