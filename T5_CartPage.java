package demoblaze;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class T5_CartPage extends BaseClass 
{

	@BeforeClass
	public void pageSetUp() throws InterruptedException 
	{
	p2.doLogin(prop.getData("username"), prop.getData("password"));
	Thread.sleep(2000);
	}
	
	@Test
	public void myCart() 
	{
		p5.myCart(prop.getData("product1"));
		
	}
}
