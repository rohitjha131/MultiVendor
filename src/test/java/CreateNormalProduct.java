import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.mvm.qa.base.TestBase;
import com.mvm.qa.pages.CreateProduct;
import com.mvm.qa.pages.ProductMenuOptions;

public class CreateNormalProduct extends TestBase{

	CreateProduct createproduct;
	public CreateNormalProduct(){
		super();	
	}
	
	@BeforeSuite
	public void setup() {
		initialization();
		

	}
	@Test(priority=1)
	public void clickOnproductMenu()
		{
		ProductMenuOptions productmenuoption =new ProductMenuOptions();
		     productmenuoption.clickOnProductMenu();
		}
	@Test(priority=2)
	public void clickOnAddProductButton() throws InterruptedException 
			{
		        CreateProduct createproduct= new CreateProduct();
		            createproduct.clickOnAddProductButton();
		            createproduct.productForm();
			}
	
}
