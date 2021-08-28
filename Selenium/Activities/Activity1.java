import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;
	WebElement element ;
	String actualTitleName="http://alchemy.hguy.co/orangehrm";

	@Test
	public void login()
	{
	
	driver= new FirefoxDriver();
	driver.get("http://alchemy.hguy.co/orangehrm");
	String titleName=driver.getTitle();
	System.out.println(titleName);
	Assert.assertEquals(actualTitleName, titleName);
	
	
	
	}
}
