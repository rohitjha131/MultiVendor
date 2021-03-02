package com.mvm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mvm.qa.base.TestBase;

public class CreateProduct extends TestBase {
	@FindBy(xpath="//li[@value='4']")
	WebElement products;
	
	public CreateProduct() {
		PageFactory.initElements(driver, this);
	}
	public void clickOnProductMenu() throws InterruptedException {
		System.out.println("in method");
		Actions action = new Actions(driver);
		System.out.println("after action");
		action.moveToElement(products).perform();
		driver.findElement(By.xpath("//li[text()='PRODUCTS LISTING']")).click();
	}

}
