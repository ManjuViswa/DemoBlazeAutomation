package demoblaze;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class T4_ShoppingPage extends BaseClass
{
	@BeforeClass
	public void pageSetUp() throws InterruptedException {
		Thread.sleep(2000);
		p2.doLogin(prop.getData("username"), prop.getData("password"));
	}
	
	@Test(priority=1)
	public void shoppingcart() {	
		
	p4.shoppingcart(prop.getData("product1"),prop.getData("product2"),prop.getData("product3"));
		
	}
}
