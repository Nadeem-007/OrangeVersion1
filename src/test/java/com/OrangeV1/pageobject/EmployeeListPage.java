package com.OrangeV1.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeListPage {

	
	WebDriver driver;
	public EmployeeListPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
	WebElement addOption;
	
	public void clickAddOption() {
		addOption.click();
	}
	
	@FindBy(name="firstName")
	WebElement firstNameTxtField;
	
	@FindBy(name="lastName")
	WebElement lastNameTxtField;
	
	@FindBy(xpath="//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")
	WebElement saveButton;
	
	@FindBy(xpath="//h6[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]")
	WebElement verifyUsername;
	
	public void setfirstName(String fname) {
		firstNameTxtField.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		lastNameTxtField.sendKeys(lname);
	}
	
	public void clickSaveButton() {
		saveButton.submit();
	}
	
	public String verify() {
		String value=verifyUsername.getText();
		return value;
	}
}
