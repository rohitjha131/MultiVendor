package com.mvm.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

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
	
	@FindBy(xpath="//div[@class='dropdown pull-right']")
	WebElement more_action;
	
	@FindBy(id="quantity")
	WebElement quantity;
	
	@FindBy(id="prod-form-save-btn")
	WebElement submit;
	
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
			product_name.sendKeys("test product last");
			UploadFiles uploadfiles=new UploadFiles();
			uploadfiles.UploadImage();
			product_type.sendKeys("bags");
			product_tag.sendKeys("webkul");
			price.sendKeys("660");
			Select select =new Select(track_inventory);
			select.selectByIndex(1);
			quantity.sendKeys("7");
			submit.click();

		  }
	  
	  public void validateProductCreate()
	  {
		  softAssert.assertEquals(more_action.getText(), "More Action ", "product has been not created");
		  LOG.info("product has been created");
		  softAssert.assertAll();
	  }
}
