import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class A {

	  WebDriver driver;
	/*
	@Test(groups="ExecuteThird")
	public void apple() {
	
	System.out.println("sixth");//only console
}
	
	@Test(groups="ExecuteFirst")
	public void grapes() {
		//Reporter.log("Java",true);//both on console and report
		System.out.println("Fourth");
		
	}
	
	@Test(groups="ExecuteFirst")
	public void orange() {
		//Reporter.log("programming",false);//report
		System.out.println("First");
	}
	
	
	@Test(groups="ExecuteSecond")
	public void pineApple() {
		//Reporter.log("Selenium");//report
		System.out.println("zeroth");
	}
	*/
	
	@BeforeTest
	@Parameters("browser")
	
	public void launch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			 driver=new ChromeDriver();	
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			 driver=new FirefoxDriver();
		}
		
		else if (browser.equalsIgnoreCase("edge")){
			 driver=new EdgeDriver();
		}
	}
		@Test
		public void openSite() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
	}
	
	
	
	
	
	
	
	
	
	/*
	@Test
	public void meesho() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		
	
	
}
*/
}
