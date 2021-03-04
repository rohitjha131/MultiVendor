import org.testng.annotations.BeforeSuite;

import com.mvm.qa.base.TestBase;
import com.mvm.qa.pages.CreateProduct;

public class SellerProductCreate extends TestBase{
	
	CreateProduct createproduct;
	public SellerProductCreate(){
		super();	
	}
	
	@BeforeSuite
	public void setup() {
		initialization();
	}

}
