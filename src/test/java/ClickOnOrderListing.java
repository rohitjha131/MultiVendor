import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.mvm.qa.base.TestBase;
import com.mvm.qa.pages.OrderListing;
import com.mvm.qa.pages.OrderMenuOption;

public class ClickOnOrderListing extends TestBase  {

	OrderListing orderlisting;
	OrderMenuOption ordermenuoption;
	public ClickOnOrderListing(){
		super();	
	}
	
	@BeforeSuite
	public void setup() {
		initialization();
		ordermenuoption=new OrderMenuOption();
		
	}
	
	@Test()
	public void clickOnOrder() throws InterruptedException
	{
		ordermenuoption.clickOnOrderMenu();
//		driver.manage().deleteAllCookies();
		
		
	}
	@Test(priority=1)
	public void clickOnOrderExportButton() throws InterruptedException
	{
		orderlisting = new OrderListing();
		orderlisting.exportOrder();
		
		
		
	}
	
}
