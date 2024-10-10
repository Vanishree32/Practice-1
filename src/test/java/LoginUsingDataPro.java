import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginUsingDataPro {
	
	
	@DataProvider(name="test")
	public Object[] dataProFunction() {
		
		return new Object[][] {
			{"admin1@yourstore.com","admin1"},
			
			{"praveen.kumar.k@brigosha.com","Test@123"}
		};
	}

	@Test(dataProvider="test")
	public void login(String username,String password) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://newpmt.brigosha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Profile'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='email ID']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
	
	}
	
	@Test
	public void method1() {
		System.out.println("Hello");
	}
	@DataProvider(name="test1")
	public Object[][] dataProFromExcel(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException{
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Brigosha_Guest\\eclipse-workspace\\LearnSelenium\\src\\test\\resources\\Config_Folder\\ExcelA.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
			 String data=wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
			// int data1=wb.getSheet(sheetName).getRow(row).getCell(cell).getNumericCellValue();
			// boolean data2=wb.getSheet(sheetName).getRow(row).getCell(cell).getBooleanCellValue();
			 
			return null;
				
		
	}
}
