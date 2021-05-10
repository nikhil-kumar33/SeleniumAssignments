package seleniumAssignments2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Assignment4 {
  WebDriver driver;
  @Test
  public void test() throws IOException {
	  FileInputStream fis= new FileInputStream("C:\\Users\\Laptop\\Documents\\screenshots\\Parameters.xlsx");
	//Workbook reference of the excel file
	  XSSFWorkbook workbook = new XSSFWorkbook(fis);
	//Sheet which needs to be accessed from within the workbook
	  XSSFSheet sheet = workbook.getSheet("Sheet1");
	//Count the number of rows
	  int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

	  for(int i=0; i<=rowCount;i++) {
      driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
      driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).clear();
	  }
		workbook.close();
		fis.close();
	

	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\Documents\\eclipse jar files\\drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://google.com/");
	  
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.quit();
  }

}
