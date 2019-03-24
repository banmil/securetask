package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TSMOffer {
	
	public WebDriver driver;

	By jobtitle=By.className("job-title");
	By technicalSMJob=By.xpath("//a[contains(@href, 'https://emp.jobylon.com/jobs/35989-f-secure-technical-service-manager/')]");
	


	public TSMOffer(WebDriver driver) {
		
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}


	public WebElement jobtitle() {
		return driver.findElement(jobtitle);
	}
	
	public WebElement technicalSMJob() {
		return driver.findElement(technicalSMJob);
	}

}
