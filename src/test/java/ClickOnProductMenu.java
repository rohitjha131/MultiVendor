
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.mvm.qa.base.TestBase;
import com.mvm.qa.pages.CreateProduct;

public class ClickOnProductMenu extends TestBase {
	
	
	CreateProduct createproduct;
	public ClickOnProductMenu(){
		super();	
	}
    private static final Logger LOG = LogManager.getLogger(ClickOnProductMenu.class);

	@BeforeSuite
	public void setup() {
		initialization();
		createproduct=new CreateProduct();
		LOG.info("rohit jha");
//		loginpage =new LoginPage();
//		clickon =new ClickOnSignInButton();
	}
	@Test()
	public void clickOnProduct() throws InterruptedException
	{
		createproduct.clickOnProductMenu();
		driver.manage().deleteAllCookies();
		
		
	}

}
