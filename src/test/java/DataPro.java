
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataPro {

	@DataProvider(name="test")
	public Object[][] providingData() {
		
		return new Object[][]{ 
			{"a"},{"b"},{"c"}
			
		};
	}
	
	
	@Test(dataProvider="test")
	public void printData(String key) {
		System.out.println(key);
	}
}
