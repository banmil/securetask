package joboffers;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.FSecureJobs;
import resources.Base;

public class HomePage extends Base {

	@BeforeTest

	public void startBroweser() throws IOException {
		driver = initializeDriver();
		driver.get("https://www.f-secure.com/en/web/about_global/careers/job-openings");
	}

	@Test

	public void pageNavigation() throws IOException {
		
		System.out.println(driver.getTitle());
		//String actualParentTitle=driver.getTitle();
		
		Assert.assertEquals(driver.getTitle(), "Job openings | F-Secure");
		
		FSecureJobs fsj = new FSecureJobs(driver);
		Select city = new Select(fsj.citySelector());
		city.selectByValue("Poznań");
		fsj.technicalSMJob().click();
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentID=it.next();
		String childID=it.next();
		driver.switchTo().window(childID);
		
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Technical Service Manager - F-Secure | Jobylon");
		
	}

}
