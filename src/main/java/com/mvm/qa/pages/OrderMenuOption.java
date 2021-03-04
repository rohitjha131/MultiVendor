package com.mvm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mvm.qa.base.TestBase;

public class OrderMenuOption extends TestBase {

	@FindBy(xpath="//li[@value='5']")
	WebElement orders;
	
	public OrderMenuOption() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	Actions action = new Actions(driver);
	public void clickOnOrderMenu() 
		{
			action.moveToElement(orders).perform();
			driver.findElement(By.xpath("//li[text()='ORDERS LISTING']")).click();
		}

	
	
}
