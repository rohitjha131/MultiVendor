package com.mvm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mvm.qa.base.TestBase;

public class ProductMenuOptions extends TestBase{

	@FindBy(xpath="//li[@value='4']")
	WebElement products;
	
	public ProductMenuOptions() 
		{
			PageFactory.initElements(driver, this);
		}
	Actions action = new Actions(driver);
	public void clickOnProductMenu() 
		{
			action.moveToElement(products).perform();
			driver.findElement(By.xpath("//li[text()='PRODUCTS LISTING']")).click();
		}

}
