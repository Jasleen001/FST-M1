import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity_9_1 {

	public static void main(String[] args) 
	{
		WebDriver driver;
		driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/selects");// Browser Launch
		
		WebElement Opt = driver.findElement(By.id("single-select"));
		
		Select sel = new Select(driver.findElement(By.id("single-select")));
		sel.selectByVisibleText("Option 2"); // Selecting the 2nd dropdown 
		WebElement Opt1 = sel.getFirstSelectedOption();
		String Option1Text= Opt1.getText();
		System.out.println("The value of Option 1 is " + Option1Text);
	    
	    
		
		
		sel.selectByIndex(3);
		WebElement Opt2 = sel.getFirstSelectedOption();
		String Option2Text= Opt2.getText();
		System.out.println("The value of Option 2 is " + Option2Text);
		
		sel.selectByValue("4");
		WebElement Opt3 = sel.getFirstSelectedOption();
		String Option3Text= Opt3.getText();
		System.out.println("The value of Option 3 is " + Option3Text);
		
	   List<WebElement> options=  sel.getOptions();
	    for(WebElement option : options) {
            System.out.println("Option: " + option.getText());
        }
		    }
		
	}


