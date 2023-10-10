package com.OrangeV1.testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.OrangeV1.genericUtility.FileUtility;

public class BaseClass {


	public static WebDriver driver;
	FileUtility utils=new FileUtility();
	
	
	@BeforeClass
	public void setup() throws IOException {
		String browser = utils.readFileFromProperties("browser");
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(utils.readFileFromProperties("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.manage().window().minimize();
		driver.quit();
	}
}
