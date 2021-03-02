
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.mvm.qa.base.TestBase;
import com.mvm.qa.pages.CreateProduct;
import com.mvm.qa.pages.ProductMenuOptions;

public class ClickOnProductMenu extends TestBase {
	
	
	ProductMenuOptions productmenuoptions;
	public ClickOnProductMenu(){
		super();	
	}
    private static final Logger LOG = LogManager.getLogger(ClickOnProductMenu.class);

	@BeforeSuite
	public void setup() {
		initialization();
		productmenuoptions=new ProductMenuOptions();
		LOG.info("rohit jha");
//		loginpage =new LoginPage();
//		clickon =new ClickOnSignInButton();
	}
	@Test()
	public void clickOnProduct() throws InterruptedException
	{
		productmenuoptions.clickOnProductMenu();
		driver.manage().deleteAllCookies();
		
		
	}

}
