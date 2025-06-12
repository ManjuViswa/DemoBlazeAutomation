package demoblaze;

import org.testng.annotations.Test;


public class T1_UserRegistration extends BaseClass
 {

	@Test
	public void signup() 
	{
		p1.signup(prop.getData("signun"),prop.getData("signpw"));
	}
}

