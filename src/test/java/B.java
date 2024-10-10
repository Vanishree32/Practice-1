import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class B {

	@Test
	public void flipkart() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
	
	@Test
	public void mytra() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
	}
	
}
