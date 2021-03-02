import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.mvm.qa.base.TestBase;
import com.mvm.qa.pages.CreateProduct;
//import com.mvm.qa.pages.ClickOnSignInButton;
//import com.mvm.qa.pages.LoginPage;

public class LaunchUrl  extends TestBase{
	
	CreateProduct createproduct;
	public LaunchUrl(){
		super();	
	}
	
	@BeforeSuite
	public void setup() {
		initialization();
		createproduct=new CreateProduct();
//		loginpage =new LoginPage();
//		clickon =new ClickOnSignInButton();
	}
	@Test()
	public void clickOnProduct() throws InterruptedException
	{
//		createproduct.clickOnProductMenu();
		driver.manage().deleteAllCookies();
		
		
	}

}
