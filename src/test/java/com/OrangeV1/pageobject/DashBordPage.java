package com.OrangeV1.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBordPage {

	WebDriver driver;
	public DashBordPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class=\"oxd-main-menu-item\"]/span[text()=\"PIM\"]")
	WebElement PIM_MajorTab;
	
	public void clickPIM() {
		PIM_MajorTab.click();
	}

}
