package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Base {
	
public WebDriver driver;
public Properties prop;
	
public WebDriver initializeDriver() throws IOException {
	
	Properties prop=new Properties();
	FileInputStream filepath=new FileInputStream("D:\\com.fsecure.com\\fsecure\\src\\main\\java\\resources\\data.properties");
	
	prop.load(filepath);
	String browserName=prop.getProperty("browser");
	
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","D:\\webdriver chrome\\NEW\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	else if(browserName.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		driver=new FirefoxDriver();	
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	return driver;
}

}
