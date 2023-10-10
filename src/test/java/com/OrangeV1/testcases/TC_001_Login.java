package com.OrangeV1.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeV1.pageobject.DashBordPage;
import com.OrangeV1.pageobject.EmployeeListPage;
import com.OrangeV1.pageobject.LoginPage;

public class TC_001_Login extends BaseClass{


	@Test(priority = 1)
	public void loginFucntionality() throws IOException, InterruptedException {

		LoginPage login=new LoginPage(driver);
		login.setUsername(utils.readFileFromProperties("username"));
		login.setPwd(utils.readFileFromProperties("password"));
		login.clickLoginButton();

		Thread.sleep(3000);

		Assert.assertEquals(driver.getTitle(), "OrangeHRM");

	}
	
	@Test(priority = 2)
	public void userCreation() throws InterruptedException {
		DashBordPage dashpage=new DashBordPage(driver);
		Thread.sleep(2000);

		dashpage.clickPIM();
		
		EmployeeListPage employeePage=new EmployeeListPage(driver);
		Thread.sleep(2000);

		employeePage.clickAddOption();
		Thread.sleep(2000);

		employeePage.setfirstName("Virat");
		Thread.sleep(2000);

		employeePage.setLastName("kohli");
		Thread.sleep(2000);

		employeePage.clickSaveButton();
		Thread.sleep(2000);
		
		System.out.println("test case passed");

		
	/*	String text = employeePage.verify();
		Thread.sleep(2000);

		Assert.assertEquals(text, "Virat kohli"); */
	}
}
