import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Project_Activity4 
{
	 WebDriverWait wait;
	 AppiumDriver<MobileElement> driver = null;
	 
	   @BeforeTest
	    public void setup() throws MalformedURLException 
	    {

	        // Set the Desired Capabilities
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "PixelEmulator");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("appPackage", "com.android.chrome");
	        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
	        caps.setCapability("noReset", true);

	        // Instantiate Appium Driver
	        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	        wait = new WebDriverWait(driver, 10);
	    }
	  
	  
	    @Test
	    public void googleChromeActivities() throws InterruptedException 
	  {
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.get("https://www.training-support.net/selenium");
	        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//android.view.View)[14]"))).click();
	        driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector()).getChildByDescription(UiSelector().className(\"android.view.View\"), \"Tab Opener Launch new tabs with the click of a button.\")")).click();
	        driver.findElementById("taskInput").click();
	        driver.findElementById("taskInput").sendKeys("My Task 1");
	        System.out.println("Enter the task name");
	        Thread.sleep(1000);
	        driver.findElementByXPath("//android.widget.Button").click();
	        System.out.println("Task added succesfully");
	        
	       List<MobileElement> list=   driver.findElementsById("tasksList");
	       int taskList= list.size();
	       
	       driver.findElementByXPath("//android.view.View").click();
	       System.out.println("List is clear " + taskList);

	                
	            }

	       
	  
	  @AfterTest
	    public void tearDown() {
	        driver.quit();
	    }
}
