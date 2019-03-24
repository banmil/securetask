package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FSecureJobs {
	
	public WebDriver driver;

	By city=By.id("job-city");
	By applying=By.cssSelector("a[href='#apply']");
	
	public FSecureJobs(WebDriver driver) {
		
		this.driver=driver;

	}


	public WebElement citySelector() {
		return driver.findElement(city);
	}
	
	public WebElement applying() {
		return driver.findElement(applying);
	}
	
	
}
