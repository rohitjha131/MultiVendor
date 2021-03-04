package com.mvm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


import com.mvm.qa.base.TestBase;

public class OrderListing extends TestBase{

	@FindBy(id="Orders")
	WebElement orders;
	
	@FindBy(id="from_date1")
	WebElement form_date;
	
	@FindBy(id="to_date1")
	WebElement to_date;
	
	@FindBy(xpath="//a[text()='4']")
	WebElement selectdate;
	
	@FindBy(xpath="//select[@data-handler='selectMonth']")
	WebElement selectMonth;
	
	@FindBy(xpath="//input[@value='fulfilled']")
	WebElement fullfilled;
	
	@FindBy(id="myExportModalAction")
	WebElement export;
	
	public OrderListing() {
		PageFactory.initElements(driver, this);
	}
	
	public void exportOrder()
		{
			orders.click();
			wait.until(ExpectedConditions.visibilityOf(form_date));
			form_date.click();;
			Select select =new Select(selectMonth);
			select.selectByIndex(1);
			selectdate.click();
			to_date.click();
			selectdate.click();
			fullfilled.click();
			export.click();
		}
	
	
	
	
	
}
