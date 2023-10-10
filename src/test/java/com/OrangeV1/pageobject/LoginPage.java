package com.OrangeV1.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="username")
	WebElement userNameTxtField;
	
	
	@FindBy(name="password")
	WebElement pwdTxtField;
	
	@FindBy(xpath="//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")
	WebElement loginButton;
	
	public void setUsername(String name) {
		userNameTxtField.sendKeys(name);
	}
	
	public void setPwd(String pwd) {
		pwdTxtField.sendKeys(pwd);
	}
	
	public void clickLoginButton() {
		loginButton.submit();
	}
}
