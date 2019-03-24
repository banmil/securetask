package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FSecureJobs {
	
	public WebDriver driver;

	By city=By.id("job-city");
	By technicalSMJob=By.xpath("//a[contains(@href, 'https://emp.jobylon.com/jobs/35989-f-secure-technical-service-manager/')]");
	
	public FSecureJobs(WebDriver driver) {
		
		this.driver=driver;
	}


	public WebElement citySelector() {
		return driver.findElement(city);
	}
	
	public WebElement technicalSMJob() {
		return driver.findElement(technicalSMJob);
	}
	
}
