package seleniumAssignments2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Assignment5 {
	  WebDriver driver;
	  
	  List<String> listStrings = new ArrayList<String>();
  @Test
  public void test() {
	  
	  WebElement table= driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]/table[1]/tbody"));
	  List<WebElement>rows= table.findElements(By.tagName("tr"));
	  
	  for(int i=3,j=0;i<rows.size()-2;i++,j++) {
		  List<WebElement>col= rows.get(i).findElements(By.tagName("td"));
		  listStrings.add(col.get(2).getText());
		 }
	  int j=0;
	  for(String value: listStrings) {
		  int n=0;
		  for(String value1:listStrings) {
		     if(value.equals(value1))
		    	j= ++n;
		    
		  }
		  if(j>1)
		  System.out.println(value +" pincode is repeated for " + j +" times and is not unique" );
	  }
	  
 }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Documents\\eclipse jar files\\drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://chennaiiq.com/chennai/pincode-by-name.php/");
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.quit();
  }

}
