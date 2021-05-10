package seleniumAssignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Assignment2 {
	WebDriver driver;
  @Test
  public void test() throws InterruptedException {
	  
	//WebElement on which drag and drop operation needs to be performed  
      WebElement from = driver.findElement(By.xpath("//*[@id='credit2']/a"));  

  //WebElement to which the above object is dropped  
      WebElement to = driver.findElement(By.xpath("//*[@id='bank']/li"));  
         
  //Creating object of Actions class to build composite actions  
      Actions act = new Actions(driver);  
         Thread.sleep(2000);
  //Performing the drag and drop action  
      act.dragAndDrop(from,to).build().perform();
      Thread.sleep(1000);

  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Documents\\eclipse jar files\\drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demo.guru99.com/test/drag_drop.html");
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(1000);
        driver.quit();
  }

}
