package com.mvm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mvm.qa.base.TestBase;

import GenericFunction.UploadFiles;

public class CreateProduct extends TestBase {
	
	
	
	@FindBy(xpath="//a[text()='ADD PRODUCT']")
	WebElement addproductbutton;
	
	@FindBy(id="seller_email")
	WebElement seller_email;
	
	@FindBy(id="product_name")
	WebElement product_name;
	
	@FindBy(id="product_type")
	WebElement product_type;
	
	@FindBy(xpath="(//input[@class='ui-widget-content ui-autocomplete-input'])[1]")
	WebElement product_tag;
	
	@FindBy(id="price")
	WebElement price;
	
	@FindBy(id="track_inventory")
	WebElement track_inventory;
	
	@FindBy(id="quantity")
	WebElement quantity;
	public CreateProduct() {
		PageFactory.initElements(driver, this);
	}
//	
	
	public void clickOnAddProductButton() throws InterruptedException
		{
		 Thread.sleep(5000);
		addproductbutton.click();
		}
        
	  public void productForm() throws InterruptedException
		  {
			seller_email.sendKeys("demo@webkul.com");  
			product_name.sendKeys("test product");
			UploadFiles uploadfiles=new UploadFiles();
			uploadfiles.UploadImage();
			product_type.sendKeys("bags");
			product_tag.sendKeys("webkul");
			Select select =new Select(track_inventory);
			select.selectByIndex(1);
			quantity.sendKeys("7");
			
		  }
}
