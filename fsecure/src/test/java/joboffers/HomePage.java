package joboffers;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.FSecureJobs;
import resources.Base;

public class HomePage extends Base{
	
	@Test
	
	public void pageNavigation() throws IOException {
		driver=initializeDriver();
		driver.get("https://www.f-secure.com/en/web/about_global/careers/job-openings");
		
		FSecureJobs fsj=new FSecureJobs(driver);
		System.out.println(fsj.applying().getText());
		Assert.assertEquals("Applying", fsj.applying().getText());
	}

}
